package com.ksensoy.creditapplicationsystem.model.mapper;

import com.ksensoy.creditapplicationsystem.model.dto.ApplicationDTO;
import com.ksensoy.creditapplicationsystem.model.entity.Application;

public class ApplicationMapper {
    public  static ApplicationDTO toDTO(Application application) {
        ApplicationDTO applicationDTO= new ApplicationDTO();
        applicationDTO.setStatus(application.getStatus());
        applicationDTO.setApplication_time(application.getApplication_time());

        return applicationDTO;
    }
    public  static  Application toEntity(ApplicationDTO applicationDTO){
        Application application = new Application();
        application.setStatus(applicationDTO.getStatus());
        application.setApplication_time(applicationDTO.getApplication_time());

        return application;
    }
}
