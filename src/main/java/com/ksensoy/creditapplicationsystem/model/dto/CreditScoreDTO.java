package com.ksensoy.creditapplicationsystem.model.dto;

import lombok.Data;

import java.util.Date;
@Data
public class CreditScoreDTO {
    private  int score;
    private Date score_time;
}
