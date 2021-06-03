package com.ilkertoksoz.vodafone.vehicle;

import com.ilkertoksoz.vodafone.constant.CarConstants;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

public class Sedan implements Car {

	@Override
	public String getType() {
		return CarConstants.SEDAN;
	}
}