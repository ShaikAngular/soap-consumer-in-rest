package com.consumesoapserviceinrest.consumesoapserviceinrest.services.impl;

import org.springframework.stereotype.Service;

import com.consumesoapserviceinrest.consumesoapserviceinrest.services.SoapToRestService;
import com.parasoft.wsdl.calculator.Calculator;


@Service
public class SoapToRestServiceImpl implements SoapToRestService {

	@Override
	public String getStringFromService() {
		Calculator calculator = new Calculator();
		// TODO Auto-generated method stub
		return "the sum is =" + calculator.getICalculator().add(2, 5);
	}

}
