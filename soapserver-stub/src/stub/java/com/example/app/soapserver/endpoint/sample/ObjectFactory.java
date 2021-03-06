
package com.example.app.soapserver.endpoint.sample;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.app.soapserver.endpoint.sample package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Execute_QNAME = new QName("http://sample.endpoint.soapserver.app.example.com/", "execute");
    private final static QName _ExecuteResponse_QNAME = new QName("http://sample.endpoint.soapserver.app.example.com/", "executeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.app.soapserver.endpoint.sample
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.example.app.soapserver.endpoint.sample.ResponseMessage }
     *
     */
    public ResponseMessage createResponseMessage() {
        return new ResponseMessage();
    }

    /**
     * Create an instance of {@link com.example.app.soapserver.endpoint.sample.ExecuteResponse }
     *
     */
    public ExecuteResponse createExecuteResponse() {
        return new ExecuteResponse();
    }

    /**
     * Create an instance of {@link com.example.app.soapserver.endpoint.sample.RequestMessage }
     *
     */
    public RequestMessage createRequestMessage() {
        return new RequestMessage();
    }

    /**
     * Create an instance of {@link Execute }
     *
     */
    public Execute createExecute() {
        return new Execute();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Execute }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://sample.endpoint.soapserver.app.example.com/", name = "execute")
    public JAXBElement<Execute> createExecute(Execute value) {
        return new JAXBElement<Execute>(_Execute_QNAME, Execute.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.example.app.soapserver.endpoint.sample.ExecuteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sample.endpoint.soapserver.app.example.com/", name = "executeResponse")
    public JAXBElement<ExecuteResponse> createExecuteResponse(ExecuteResponse value) {
        return new JAXBElement<ExecuteResponse>(_ExecuteResponse_QNAME, ExecuteResponse.class, null, value);
    }

}
