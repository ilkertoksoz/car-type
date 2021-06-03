package com.ilkertoksoz.vodafone.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.ilkertoksoz.vodafone.factory.CarFactory;
import com.ilkertoksoz.vodafone.service.impl.CarCallerServiceImpl;
import com.ilkertoksoz.vodafone.vehicle.Car;

public class CarCallerServiceImplTest {

	private CarFactory carFactory;
	private CarCallerService carCallerService;
	private Car car;

	@Before
	public void setUp() {
		
		 carFactory = mock(CarFactory.class);
		 car = mock(Car.class);
         carCallerService = new CarCallerServiceImpl(carFactory);
	}

	@Test
	public void testCarType() {

		when(carFactory.getCar((anyString()))).thenReturn(car);
		
		String result = carCallerService.getCarType("Test");

		assertNotNull(result);

	}
}