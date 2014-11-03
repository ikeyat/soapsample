
package com.example.app.soapserver.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.app.soapserver.endpoint package. 
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

    private final static QName _ExecuteHello_QNAME = new QName("http://endpoint.soapserver.app.example.com/", "executeHello");
    private final static QName _ExecuteHelloResponse_QNAME = new QName("http://endpoint.soapserver.app.example.com/", "executeHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.app.soapserver.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExecuteHelloResponse }
     * 
     */
    public ExecuteHelloResponse createExecuteHelloResponse() {
        return new ExecuteHelloResponse();
    }

    /**
     * Create an instance of {@link ExecuteHello }
     * 
     */
    public ExecuteHello createExecuteHello() {
        return new ExecuteHello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soapserver.app.example.com/", name = "executeHello")
    public JAXBElement<ExecuteHello> createExecuteHello(ExecuteHello value) {
        return new JAXBElement<ExecuteHello>(_ExecuteHello_QNAME, ExecuteHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soapserver.app.example.com/", name = "executeHelloResponse")
    public JAXBElement<ExecuteHelloResponse> createExecuteHelloResponse(ExecuteHelloResponse value) {
        return new JAXBElement<ExecuteHelloResponse>(_ExecuteHelloResponse_QNAME, ExecuteHelloResponse.class, null, value);
    }

}
