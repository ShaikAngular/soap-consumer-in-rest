package com.parasoft.wsdl.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2022-10-17T22:03:03.307+05:30
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://www.parasoft.com/wsdl/calculator/", name = "ICalculator")
@XmlSeeAlso({ObjectFactory.class})
public interface ICalculator {

    @WebMethod(action = "multiply")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.MultiplyResponse")
    @WebResult(name = "Result", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
    public float multiply(
        @WebParam(name = "x", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float x,
        @WebParam(name = "y", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float y
    );

    @WebMethod(action = "subtract")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.SubtractResponse")
    @WebResult(name = "Result", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
    public float subtract(
        @WebParam(name = "x", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float x,
        @WebParam(name = "y", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float y
    );

    @WebMethod(action = "add")
    @RequestWrapper(localName = "add", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.AddResponse")
    @WebResult(name = "Result", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
    public float add(
        @WebParam(name = "x", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float x,
        @WebParam(name = "y", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float y
    );

    @WebMethod(action = "divide")
    @RequestWrapper(localName = "divide", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", className = "com.parasoft.wsdl.calculator.DivideResponse")
    @WebResult(name = "Result", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
    public float divide(
        @WebParam(name = "numerator", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float numerator,
        @WebParam(name = "denominator", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        float denominator
    );
}
