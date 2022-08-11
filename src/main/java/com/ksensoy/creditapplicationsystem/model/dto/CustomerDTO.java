package com.ksensoy.creditapplicationsystem.model.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private String first_name;
    private String last_name;
    private String id_number;
    private  String phone;
    private int  monthly_income;
}
