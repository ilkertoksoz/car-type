package com.ilkertoksoz.vodafone.constant;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

public class CarConstantTest {

	@Test
	public void testCarConstant_isEqualToSedan_thenReturnSedan() {

		assertEquals("Sedan", CarConstants.SEDAN);
	}

	@Test
	public void testCarConstant_isNotEqualToSedan_ThenReturnFalse() {

		assertNotEquals("Error", CarConstants.SEDAN);
	}

	@Test
	public void testCarConstant_isEqualToCabrio_thenReturnCabrio() {

		assertEquals("Cabrio", CarConstants.CABRIO);
	}

	@Test
	public void testCarConstant_isNotEqualToCabrio_thenReturnFalse() {

		assertNotEquals("Error", CarConstants.CABRIO);
	}

	@Test
	public void testCarConstant_isEqualToHatchback_thenReturnHatchBack() {

		assertEquals("Hatchback", CarConstants.HATCHBACK);
	}

	@Test
	public void testCarConstant_isNotEqualToHatchback_thenReturnFalse() {

		assertNotEquals("Error", CarConstants.HATCHBACK);
	}

}