package com.ksensoy.creditapplicationsystem.model.repository;

import com.ksensoy.creditapplicationsystem.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
/*    Optional<Customer> getCustomerByPhone(String phone);
    Optional<Customer> getCustomerById_number(String id_number);
    List<Optional<Customer>> getCustomerByFirst_nameAndLast_name(String first_name, String last_name);
    List<Optional<Customer>> getCustomerByMonthly_income(int  monthly_income);*/


    Optional<Customer> getCustomerById(Long id);
    //Optional<Customer> getCustomerByIdAndId_number(Long id,String idn);
}
