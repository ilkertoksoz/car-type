package com.ilkertoksoz.vodafone.exception;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

public class InvalidCarTypeException extends RuntimeException {

	private static final long serialVersionUID = -5471909636279282116L;

	public InvalidCarTypeException() {

		super("You need to enter one of following car types : {Sedan, Hatchback, Cabrio}");
	}

}