package com.ksensoy.creditapplicationsystem.model.mapper;

import com.ksensoy.creditapplicationsystem.model.dto.CustomerDTO;
import com.ksensoy.creditapplicationsystem.model.entity.Customer;

public class CustomerMapper {
    public static CustomerDTO toDTO(Customer customer) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setId_number(customer.getId_number());
        customerDTO.setFirst_name(customer.getFirst_name());
        customerDTO.setLast_name(customer.getLast_name());
        customerDTO.setPhone(customer.getPhone());
        customerDTO.setMonthly_income(customer.getMonthly_income());

        return customerDTO;
    }

    public static Customer toEntity(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setId_number(customerDTO.getId_number());
        customer.setFirst_name(customerDTO.getFirst_name());
        customer.setLast_name(customerDTO.getLast_name());
        customer.setPhone(customerDTO.getPhone());
        customer.setMonthly_income(customerDTO.getMonthly_income());

        return customer;
    }
}
