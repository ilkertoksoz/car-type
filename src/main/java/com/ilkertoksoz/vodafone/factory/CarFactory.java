package com.ilkertoksoz.vodafone.factory;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.ilkertoksoz.vodafone.exception.CarTypeNotFoundException;
import com.ilkertoksoz.vodafone.exception.InvalidCarTypeException;
import com.ilkertoksoz.vodafone.vehicle.Cabrio;
import com.ilkertoksoz.vodafone.vehicle.Car;
import com.ilkertoksoz.vodafone.vehicle.Hatchback;
import com.ilkertoksoz.vodafone.vehicle.Sedan;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@Component
public class CarFactory {

	public Car getCar(String carType) {

		if (StringUtils.isBlank(carType)) {
			throw new CarTypeNotFoundException();
		}

		if (carType.equalsIgnoreCase("Sedan")) {
			return new Sedan();

		} else if (carType.equalsIgnoreCase("Hatchback")) {
			return new Hatchback();

		} else if (carType.equalsIgnoreCase("Cabrio")) {
			return new Cabrio();
		}

		else {
			throw new InvalidCarTypeException();
		}

	}

}