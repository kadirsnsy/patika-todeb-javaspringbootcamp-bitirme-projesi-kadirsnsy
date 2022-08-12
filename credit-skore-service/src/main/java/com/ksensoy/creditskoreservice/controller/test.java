package com.ksensoy.creditskoreservice.controller;

import com.ksensoy.creditskoreservice.Studendt;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/testapi")
public class test {
    private static Logger logger = Logger.getLogger("test");
    @GetMapping("/all")
    public Studendt getTest() {

        logger.info("testapi");
        Studendt studendt= new Studendt();
        studendt.setIsim("kadir sensoy");
        studendt.yas=39;

        return studendt;
    }


}
