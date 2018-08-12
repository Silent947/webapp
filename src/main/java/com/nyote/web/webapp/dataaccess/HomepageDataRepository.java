package com.nyote.web.webapp.dataaccess;

import org.springframework.stereotype.Component;

@Component
public class HomepageDataRepository {
    private static final String data = "Homepage data";

    static String getData(){
        return data;
    }
}
