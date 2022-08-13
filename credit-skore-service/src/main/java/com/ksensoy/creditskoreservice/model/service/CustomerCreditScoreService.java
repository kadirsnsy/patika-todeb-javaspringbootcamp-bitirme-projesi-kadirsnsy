package com.ksensoy.creditskoreservice.model.service;

import com.ksensoy.creditskoreservice.model.Repository.CustomerCreditScoreRepository;
import com.ksensoy.creditskoreservice.model.dto.CustomerCreditScoreDTO;
import com.ksensoy.creditskoreservice.model.entity.CustomerCreditScore;
import com.ksensoy.creditskoreservice.model.mapper.CustomerCreditScoreMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerCreditScoreService {
    private final CustomerCreditScoreRepository customerCreditScoreRepository;

    public List<CustomerCreditScore> getAllCustomerCreditScore() {
        List<CustomerCreditScore> customerCreditScores = customerCreditScoreRepository.findAll();

        return customerCreditScores;
    }

    public CustomerCreditScore getCustomerCreditScore(String tc) {
        List<CustomerCreditScore> customerCreditScores = customerCreditScoreRepository.findAll();
        for (CustomerCreditScore creditScore : customerCreditScores
        ) {
            if (creditScore.getId_number().equals(tc))
                return creditScore;
        }
        return null;
    }
    public CustomerCreditScore addCustomer(CustomerCreditScoreDTO customerCreditScoreDTO) {
        CustomerCreditScore  customerCreditScore = CustomerCreditScoreMapper.toEntity(customerCreditScoreDTO);
        customerCreditScoreRepository.save(customerCreditScore);
        return customerCreditScore;
    }

}