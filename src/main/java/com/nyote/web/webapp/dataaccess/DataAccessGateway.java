package com.nyote.web.webapp.dataaccess;

import org.springframework.stereotype.Component;

import static com.nyote.web.webapp.dataaccess.HomepageDataRepository.getData;

@Component
public class DataAccessGateway {
    public String getHomepageData(){
        return HomepageDataRepository.getData();
    }
}
