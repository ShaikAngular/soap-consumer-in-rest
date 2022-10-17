package com.consumesoapserviceinrest.consumesoapserviceinrest.services.impl;

import org.springframework.stereotype.Service;
import org.tempuri.Calculator;

import com.consumesoapserviceinrest.consumesoapserviceinrest.services.SoapToRestService;





@Service
public class SoapToRestServiceImpl implements SoapToRestService {

	@Override
	public String getStringFromService() {
		Calculator calculator = new Calculator();
		// TODO Auto-generated method stub
		return "the sum of 7 and 5 is =" + calculator.getCalculatorSoap().add(5, 7) 
				+ "the difference of 7 and 5 is =" + calculator.getCalculatorSoap().subtract(10,7)
				+ "the product of 7 and 5 is =" + calculator.getCalculatorSoap().multiply(7, 5);
	}

}
