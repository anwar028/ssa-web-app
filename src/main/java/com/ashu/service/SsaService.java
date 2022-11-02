package com.ashu.service;

import org.springframework.stereotype.Service;

@Service
public class SsaService {

	public String fetchStateName(String ssn) {

		String stateName = null;

		if (ssn.startsWith("5")) {

			stateName = "Newjersy";
		}

		else if (ssn.startsWith("6")) {

			stateName = "Kentaky";
		} else if (ssn.startsWith("7")) {

			stateName = "Ohio";
		} else {
			stateName = "Invalid SSN";
		}
		return stateName;
	}

}
