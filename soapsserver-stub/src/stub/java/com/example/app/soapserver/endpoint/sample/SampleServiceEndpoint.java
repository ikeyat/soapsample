
package com.example.app.soapserver.endpoint.sample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SampleServiceEndpoint", targetNamespace = "http://sample.endpoint.soapserver.app.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SampleServiceEndpoint {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.app.soapserver.endpoint.sample.ResponseMessage
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "execute", targetNamespace = "http://sample.endpoint.soapserver.app.example.com/", className = "com.example.app.soapserver.endpoint.sample.Execute")
    @ResponseWrapper(localName = "executeResponse", targetNamespace = "http://sample.endpoint.soapserver.app.example.com/", className = "com.example.app.soapserver.endpoint.sample.ExecuteResponse")
    public ResponseMessage execute(
            @WebParam(name = "arg0", targetNamespace = "")
            RequestMessage arg0);

}
