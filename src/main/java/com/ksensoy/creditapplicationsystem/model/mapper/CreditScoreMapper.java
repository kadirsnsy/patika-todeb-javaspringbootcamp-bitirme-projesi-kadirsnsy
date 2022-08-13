package com.ksensoy.creditapplicationsystem.model.mapper;

import com.ksensoy.creditapplicationsystem.model.dto.CreditScoreDTO;
import com.ksensoy.creditapplicationsystem.model.entity.CreditScore;

public class CreditScoreMapper {
    public static CreditScoreDTO toDTO(CreditScore creditScore) {
        CreditScoreDTO creditScoreDTO = new CreditScoreDTO();
        creditScoreDTO.setScore(creditScore.getScore());
        creditScoreDTO.setScore_time(creditScore.getScore_time());

        return creditScoreDTO;
    }

    public static CreditScore toEntity(CreditScoreDTO creditScoreDTO) {
        CreditScore creditScore = new CreditScore();
        creditScore.setScore(creditScoreDTO.getScore());
        creditScore.setScore_time(creditScoreDTO.getScore_time());

        return creditScore;
    }
}
