package com.ksensoy.creditskoreservice.controller;

import com.ksensoy.creditskoreservice.Studendt;
import lombok.Data;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.HttpRequestWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/call")
public class call {

    private static Logger logger = Logger.getLogger("call");
    @GetMapping("/get")
    public Studendt getcall()
    {


        logger.info("call");
        Studendt studendt= getEmployees();
        return studendt;
    }
    private Studendt   getEmployees()
    {
        final String uri = "http://localhost:8082/api/testapi/all";

        RestTemplate restTemplate = new RestTemplate();
        Studendt result = restTemplate.getForObject(uri, Studendt.class);
        result.setSonuc(true);

        System.out.println(result);
        return  result;

    }

}
