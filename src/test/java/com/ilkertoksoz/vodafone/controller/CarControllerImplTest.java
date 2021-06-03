package com.ilkertoksoz.vodafone.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import com.ilkertoksoz.vodafone.controller.impl.CarControllerImpl;
import com.ilkertoksoz.vodafone.service.CarCallerService;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

public class CarControllerImplTest {

	private CarCallerService callerService;
	private CarController carController;

	@Before
	public void setUp() {

		callerService = mock(CarCallerService.class);
		carController = new CarControllerImpl(callerService);

	}

	@Test
	public void testGetOneCarByCarType() {

		String carType = "";

		when(callerService.getCarType(carType)).thenReturn(carType);
		
		ResponseEntity<String> response = carController.getOneCarByCarType(carType);

		assertNotNull(response);
	}
}
