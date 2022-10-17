
package com.parasoft.wsdl.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numerator",
    "denominator"
})
@XmlRootElement(name = "divide")
public class Divide {

    protected float numerator;
    protected float denominator;

    /**
     * Gets the value of the numerator property.
     * 
     */
    public float getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     */
    public void setNumerator(float value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     */
    public float getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     */
    public void setDenominator(float value) {
        this.denominator = value;
    }

}
