package com.example.app.soapserver.domain.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by ikeya on 14/11/02.
 */
@Service
public class HelloService {
    private static final Logger logger = LoggerFactory.getLogger(HelloService.class);

    public String executeHello(String name) {
        String message = new StringBuilder("Hello ").append(name).toString();
        logger.debug(message);
        return message;
    }
}
