
package com.example.app.soapserver.endpoint.sample;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SampleService", targetNamespace = "http://sample.endpoint.soapserver.app.example.com/", wsdlLocation = "http://localhost:8080/soapserver/ws/SampleService?wsdl")
public class SampleService
    extends Service
{

    private final static URL SAMPLESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(SampleService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = SampleService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/soapserver/ws/SampleService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/soapserver/ws/SampleService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        SAMPLESERVICE_WSDL_LOCATION = url;
    }

    public SampleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SampleService() {
        super(SAMPLESERVICE_WSDL_LOCATION, new QName("http://sample.endpoint.soapserver.app.example.com/", "SampleService"));
    }

    /**
     * 
     * @return
     *     returns SampleServiceEndpoint
     */
    @WebEndpoint(name = "SampleServiceEndpointPort")
    public SampleServiceEndpointStub getSampleServiceEndpointPort() {
        return super.getPort(new QName("http://sample.endpoint.soapserver.app.example.com/", "SampleServiceEndpointPort"), SampleServiceEndpointStub.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SampleServiceEndpoint
     */
    @WebEndpoint(name = "SampleServiceEndpointPort")
    public SampleServiceEndpointStub getSampleServiceEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sample.endpoint.soapserver.app.example.com/", "SampleServiceEndpointPort"), SampleServiceEndpointStub.class, features);
    }

}