
package com.example.app.soapserver.endpoint.sample;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;


@WebService(
        endpointInterface="com.example.app.soapserver.endpoint.sample.SampleServiceEndpoint",
        wsdlLocation="/META-INF/wsdl/SampleService.wsdl"
)
public class SampleServiceEndpointStub implements SampleServiceEndpoint {
    // added as dummy
    private static final Logger logger = LoggerFactory.getLogger(SampleServiceEndpointStub.class);

    public ResponseMessage execute(RequestMessage arg0) {

        // See http://java.boot.by/ocewsd6-guide/ch08.html
        // 8.1.2.  Build the web service implementation using the above artifacts.
        // https://www.java.net/node/664889

        // begin dummy code
        logger.debug(ToStringBuilder.reflectionToString(arg0));
        ResponseMessage res = new ResponseMessage();
        res.setRes1("dummy hoge");
        res.setRes2("dummy fuga");
        res.setRes3("dummy piyo");
        return res;

        // end dummy code
    }

}
