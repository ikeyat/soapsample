package com.example.app.soapclient;

import com.example.app.soapserver.endpoint.HelloService;
import com.example.app.soapserver.endpoint.HelloServiceEndpoint;
import com.example.app.soapserver.endpoint.sample.RequestMessage;
import com.example.app.soapserver.endpoint.sample.ResponseMessage;
import com.example.app.soapserver.endpoint.sample.SampleService;
import com.example.app.soapserver.endpoint.sample.SampleServiceEndpoint;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ikeya on 14/11/03.
 */
public class SoapClient {
    private static final String INPUT_TEXT = "hogehoge";
    private static final Logger logger = LoggerFactory.getLogger(SoapClient.class);

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");

        /*
        // Standard JAX-WS
        HelloService helloService = context.getBean("helloService", HelloService.class);
        HelloServiceEndpoint helloServiceEndpoint = helloService.getHelloServiceEndpointPort();
        logger.debug(new StringBuilder("Standard JAX-WS: ")
                .append(helloServiceEndpoint.executeHello(INPUT_TEXT)).toString());

        // JAX-WS supported by Apache CXF proxy
        HelloServiceEndpoint helloServiceEndpointProxy
                = context.getBean("helloServiceEndpointProxy", HelloServiceEndpoint.class);
        logger.debug(new StringBuilder("JAX-WS supported by Apache CXF proxy: ")
                .append(helloServiceEndpointProxy.executeHello(INPUT_TEXT)).toString());
        */

        // Standard JAX-WS
        RequestMessage req = new RequestMessage();
        req.setReq1("aaa");
        req.setReq2("bbb");
        req.setReq3("ccc");

        SampleService sampleService = context.getBean("sampleService", SampleService.class);
        SampleServiceEndpoint sampleServiceEndpoint = sampleService.getSampleServiceEndpointPort();

        ResponseMessage res = sampleServiceEndpoint.execute(req);
        logger.info(new StringBuilder("Standard JAX-WS: ")
                .append(ToStringBuilder.reflectionToString(res)).toString());
    }
}
