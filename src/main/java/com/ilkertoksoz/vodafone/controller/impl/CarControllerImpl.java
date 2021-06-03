package com.ilkertoksoz.vodafone.controller.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ilkertoksoz.vodafone.controller.CarController;
import com.ilkertoksoz.vodafone.service.CarCallerService;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@RestController
public class CarControllerImpl implements CarController {

	private final CarCallerService carCallerService;

	public CarControllerImpl(CarCallerService callerService) {
		this.carCallerService = callerService;
	}

	@Override
	public ResponseEntity<String> getOneCarByCarType(String carType) {
		return ResponseEntity.ok(carCallerService.getCarType(carType));

	}

}