package com.ilkertoksoz.vodafone.exception;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

public class CarTypeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4314211343358454345L;

	public CarTypeNotFoundException() {

		super("You have not enter anything to check a car");
	}

}