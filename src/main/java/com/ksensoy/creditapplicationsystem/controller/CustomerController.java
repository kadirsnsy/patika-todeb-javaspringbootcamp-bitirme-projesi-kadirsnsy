package com.ksensoy.creditapplicationsystem.controller;

import com.ksensoy.creditapplicationsystem.model.dto.CustomerDTO;
import com.ksensoy.creditapplicationsystem.model.entity.Customer;
import com.ksensoy.creditapplicationsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private static Logger logger = Logger.getLogger("CustomerController");
    @Autowired
    private CustomerService customerService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_CLIENT')")
    @GetMapping("/all")
    public ResponseEntity getAllCustomer(){
        List<Customer>  customers= customerService.getAllCustomers();
        logger.info(customers.size()+ " customers listed");

        return ResponseEntity.ok(customers);
    }
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/add")
    public ResponseEntity createNewCourse(@RequestBody CustomerDTO customer) {
        Customer respCustomer = customerService.addCustomer(customer);
        if (respCustomer == null) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Course could not be created successfully");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(respCustomer);
    }

}
