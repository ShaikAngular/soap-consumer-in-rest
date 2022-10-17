package com.consumesoapserviceinrest.consumesoapserviceinrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumesoapserviceinrest.consumesoapserviceinrest.services.SoapToRestService;

@RestController
@RequestMapping(path = "/SoapService")
public class SoapToRestController {

	@Autowired
	private SoapToRestService soapToRestService;

	@GetMapping(path = "/ToRest")

	public String printRestData() {
		return soapToRestService.getStringFromService();
	}

}
