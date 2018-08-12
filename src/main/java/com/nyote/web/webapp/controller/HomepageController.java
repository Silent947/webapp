package com.nyote.web.webapp.controller;

import com.nyote.web.webapp.dataaccess.DataAccessGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomepageController {

    private final DataAccessGateway dataAccessGateway;

    @Autowired
    public HomepageController(DataAccessGateway dataAccessGateway) {
        this.dataAccessGateway = dataAccessGateway;
    }

    @GetMapping
    String home(){
        return dataAccessGateway.getHomepageData();
    }
}
