package com.ksensoy.creditskoreservice.model.mapper;

import com.ksensoy.creditskoreservice.model.dto.CustomerCreditScoreDTO;
import com.ksensoy.creditskoreservice.model.entity.CustomerCreditScore;

public class CustomerCreditScoreMapper {
    public static CustomerCreditScoreDTO toDTO(CustomerCreditScore customerCreditScore){
        CustomerCreditScoreDTO  customerCreditScoreDTO= new CustomerCreditScoreDTO();
        customerCreditScoreDTO.setId_number(customerCreditScore.getId_number());
        customerCreditScoreDTO.setCredit_score(customerCreditScore.getCredit_score());

        return customerCreditScoreDTO;
    }

    public  static  CustomerCreditScore toEntity(CustomerCreditScoreDTO customerCreditScoreDTO){
        CustomerCreditScore creditScore= new CustomerCreditScore();
        creditScore.setId_number(customerCreditScoreDTO.getId_number());
        creditScore.setCredit_score(creditScore.getCredit_score());
        return  creditScore;
    }
}
