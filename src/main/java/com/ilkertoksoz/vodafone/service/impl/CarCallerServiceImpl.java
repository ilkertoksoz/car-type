package com.ilkertoksoz.vodafone.service.impl;

import java.util.StringJoiner;

import org.springframework.stereotype.Service;

import com.ilkertoksoz.vodafone.constant.CarBehaviorConstants;
import com.ilkertoksoz.vodafone.factory.CarFactory;
import com.ilkertoksoz.vodafone.service.CarCallerService;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@Service
public class CarCallerServiceImpl implements CarCallerService {

	private final CarFactory carFactory;

	public CarCallerServiceImpl(CarFactory carFactory) {
		this.carFactory = carFactory;
	}

	@Override
	public String getCarType(String carType) {
		
		StringJoiner stringJoiner = new StringJoiner(" ");

		stringJoiner.add(carFactory.getCar(carType).getType());
		stringJoiner.add(CarBehaviorConstants.CAR_HAS_PRODUCED);

		return stringJoiner.toString();
	}

}