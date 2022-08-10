package com.ksensoy.creditapplicationsystem.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ApplicationDTO {
    private int status; //1 approved,2 pending, 3 rejected
    private Date application_time;
}
