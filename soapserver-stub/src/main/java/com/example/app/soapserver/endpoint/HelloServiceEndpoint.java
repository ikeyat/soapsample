package com.example.app.soapserver.endpoint;

import com.example.app.soapserver.domain.service.HelloService;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by ikeya on 14/11/02.
 */
//@Controller("helloServiceEndpoint")
@WebService(serviceName="HelloService")
public class HelloServiceEndpoint {
    @Inject
    private HelloService helloService;

    @WebMethod
    public String executeHello(String name) {
        return helloService.executeHello(name);
    }
}
