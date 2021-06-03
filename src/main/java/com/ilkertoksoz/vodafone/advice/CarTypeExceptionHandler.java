package com.ilkertoksoz.vodafone.advice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ilkertoksoz.vodafone.exception.CarTypeNotFoundException;
import com.ilkertoksoz.vodafone.exception.InvalidCarTypeException;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@ControllerAdvice
@RestController
@Slf4j
public class CarTypeExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(CarTypeNotFoundException.class)
	public final ResponseEntity<Object> handleCarTypeNotFoundException(CarTypeNotFoundException ex,
			WebRequest request) {
		log.debug("Car Type Not Found --> {}", ex.getMessage(), request);
		ExceptionResponse exceptionResponse = new ExceptionResponse(LocalDateTime.now(), ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(InvalidCarTypeException.class)
	public final ResponseEntity<Object> handleInvalidCarTypeException(InvalidCarTypeException ex, WebRequest request) {
		log.debug("Invalid Car Type --> {}", ex.getMessage(), request);
		ExceptionResponse exceptionResponse = new ExceptionResponse(LocalDateTime.now(), ex.getMessage());
		return new ResponseEntity<>(exceptionResponse, HttpStatus.EXPECTATION_FAILED);
	}

	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		log.debug("The request Parameteres which you are sending is wrong", ex.getMessage(), request);

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("date", LocalDate.now());
		body.put("status", status.value());

		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage())
				.collect(Collectors.toList());

		body.put("errors", errors);

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);

	}
}