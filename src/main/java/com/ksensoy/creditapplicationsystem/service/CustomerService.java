package com.ksensoy.creditapplicationsystem.service;

import com.ksensoy.creditapplicationsystem.model.dto.CustomerDTO;
import com.ksensoy.creditapplicationsystem.model.entity.Customer;
import com.ksensoy.creditapplicationsystem.model.mapper.CustomerMapper;
import com.ksensoy.creditapplicationsystem.model.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        List<Customer> allCustomers= customerRepository.findAll();
        return  allCustomers;
    }
    public Customer addCustomer(CustomerDTO customerDTO) {
        Customer customer= CustomerMapper.toEntity(customerDTO);
        customerRepository.save(customer);
        return customer;
    }

 /*   public Customer getCustomerById(Long id){
        Optional<Customer> customerById= customerRepository.findById(id);
        return  customerById.orElseThrow(() -> new EntityNotFoundException("Customer","id : " +id));
    }
    public Customer create(CustomerDTO customerDTO){
        Customer customer= CustomerMapper.toEntity(customerDTO);
        return  customerRepository.save(customer);
    }
    public void delete(Long id){
        getCustomerById(id);
        customerRepository.deleteById(id);
    }
    public  Customer update(CustomerDTO customerDTO){
        if (customerDTO!=null){
            //Customer customer= customerRepository.getCustomerById_number(customerDTO.getId_number()).get();
            Customer customer= CustomerMapper.toEntity(customerDTO);
           return customerRepository.save(customer);
        }
        else {
            throw new EntityNotFoundException("Customer is null" , "Customer"+customerDTO);
        }
    }*/
}
