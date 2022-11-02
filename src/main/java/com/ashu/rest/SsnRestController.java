package com.ashu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.service.SsaService;

@RestController
public class SsnRestController {

	@Autowired
	private SsaService service;
	
	@GetMapping("/stat/{ssn}")
	public ResponseEntity<String> stateName(@PathVariable String ssn){
		
		String fetchStateName = service.fetchStateName(ssn);
		
		return new ResponseEntity<String>(fetchStateName, HttpStatus.OK);
	}
}

