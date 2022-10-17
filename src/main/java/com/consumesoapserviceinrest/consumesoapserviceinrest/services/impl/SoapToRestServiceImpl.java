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
		return "the sum is =" + calculator.getCalculatorSoap().add(5, 7);
	}

}
