package com.ilkertoksoz.vodafone.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ilkertoksoz.vodafone.util.ApiPaths;

import io.swagger.annotations.Api;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@Validated
@RequestMapping(ApiPaths.CarController.CONTROLLER)
@Api(value = ApiPaths.CarController.CONTROLLER, description = "Car Type API's")
public interface CarController {

	@GetMapping(value = "/cars")
	ResponseEntity<String> getOneCarByCarType(@RequestParam("car-type")String carType);
}
