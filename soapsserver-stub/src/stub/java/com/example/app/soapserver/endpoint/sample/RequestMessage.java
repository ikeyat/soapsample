
package com.example.app.soapserver.endpoint.sample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="req1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="req2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="req3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestMessage", propOrder = {
    "req1",
    "req2",
    "req3"
})
public class RequestMessage {

    protected String req1;
    protected String req2;
    protected String req3;

    /**
     * Gets the value of the req1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReq1() {
        return req1;
    }

    /**
     * Sets the value of the req1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReq1(String value) {
        this.req1 = value;
    }

    /**
     * Gets the value of the req2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReq2() {
        return req2;
    }

    /**
     * Sets the value of the req2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReq2(String value) {
        this.req2 = value;
    }

    /**
     * Gets the value of the req3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReq3() {
        return req3;
    }

    /**
     * Sets the value of the req3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReq3(String value) {
        this.req3 = value;
    }

}
