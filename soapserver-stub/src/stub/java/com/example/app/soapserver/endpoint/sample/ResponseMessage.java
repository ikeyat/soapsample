
package com.example.app.soapserver.endpoint.sample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="res1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="res3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseMessage", propOrder = {
    "res1",
    "res2",
    "res3"
})
public class ResponseMessage {

    protected String res1;
    protected String res2;
    protected String res3;

    /**
     * Gets the value of the res1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRes1() {
        return res1;
    }

    /**
     * Sets the value of the res1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRes1(String value) {
        this.res1 = value;
    }

    /**
     * Gets the value of the res2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRes2() {
        return res2;
    }

    /**
     * Sets the value of the res2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRes2(String value) {
        this.res2 = value;
    }

    /**
     * Gets the value of the res3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRes3() {
        return res3;
    }

    /**
     * Sets the value of the res3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRes3(String value) {
        this.res3 = value;
    }

}
