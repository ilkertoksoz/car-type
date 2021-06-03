package com.ilkertoksoz.vodafone.version.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.ilkertoksoz.vodafone.service.CarCallerService;
import com.ilkertoksoz.vodafone.version.CarTypeVersionedApi;

@RestController
public class CarTypeVersionedApiImpl implements CarTypeVersionedApi {

	private final CarCallerService carCallerService;

	public CarTypeVersionedApiImpl(CarCallerService callerService) {
		this.carCallerService = callerService;
	}

	@Override
	public ResponseEntity<String> getOneCarByProduceByVersionOne(String carType) {
		return ResponseEntity.ok(carCallerService.getCarType(carType));
	}

}
