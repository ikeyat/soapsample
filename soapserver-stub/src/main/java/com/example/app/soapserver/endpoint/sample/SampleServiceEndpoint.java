package com.example.app.soapserver.endpoint.sample;

import com.example.app.soapserver.domain.service.HelloService;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by ikeya on 14/11/02.
 */
@WebService(serviceName = "SampleService")
public class SampleServiceEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(SampleServiceEndpoint.class);

    @Inject
    private HelloService helloService;

    @WebMethod
    public ResponseMessage execute(RequestMessage req) {
        logger.debug(ToStringBuilder.reflectionToString(req));
        ResponseMessage res = new ResponseMessage();
        res.setRes1("hoge");
        res.setRes2("fuga");
        res.setRes3("piyo");
        return res;
    }
}
