package com.ilkertoksoz.vodafone.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ilkertoksoz.vodafone.exception.CarTypeNotFoundException;
import com.ilkertoksoz.vodafone.exception.InvalidCarTypeException;
import com.ilkertoksoz.vodafone.vehicle.Cabrio;
import com.ilkertoksoz.vodafone.vehicle.Hatchback;
import com.ilkertoksoz.vodafone.vehicle.Sedan;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class CarFactoryTest {

	@Autowired
	private CarFactory carFactory;

	@Rule
	public ExpectedException Thrown = ExpectedException.none();

	private String SEDAN, HATCHBACK, CABRIO;

	@Before
	public void setUp() throws Exception {

		SEDAN = "Sedan";
		CABRIO = "Cabrio";
		HATCHBACK = "Hatchback";

	}

	@Test
	public void testCarFactory_isEmptyOrNull_ThenReturnException() {

		Thrown.expect(CarTypeNotFoundException.class);
		Thrown.expectMessage("You have not enter anything to check a car");

		String carType = "";

		Hatchback hatchback = (Hatchback) carFactory.getCar(carType);

		assertEquals(hatchback, (null));

	}

	/**
	 * Another usage of exception without showing a custom message
	 */
	@Test
	public void testCarFactory_isNotEqualToListedCar_thenReturnInvalidCarTypeException() {

		assertThrows(InvalidCarTypeException.class, () -> carFactory.getCar("Renault"));

	}

	@Test
	public void testCarFactory_isEqualToHatchBack_thenReturnHatchBack() {

		Hatchback hatchback = (Hatchback) carFactory.getCar(HATCHBACK);

		assertNotNull(hatchback);

		assertEquals(true, hatchback.getType().equalsIgnoreCase(HATCHBACK));
	}

	@Test
	public void testCarFactory_isEqualToSedan_thenReturnSedan() {

		Sedan sedan = (Sedan) carFactory.getCar(SEDAN);

		assertNotNull(sedan);

		assertEquals(true, sedan.getType().equalsIgnoreCase(SEDAN));
	}

	@Test
	public void testCarFactory_isEqualToCabrio_thenReturnCabrio() {

		Cabrio cabrio = (Cabrio) carFactory.getCar(CABRIO);

		assertNotNull(cabrio);

		assertEquals(true, cabrio.getType().equalsIgnoreCase(CABRIO));
	}

}