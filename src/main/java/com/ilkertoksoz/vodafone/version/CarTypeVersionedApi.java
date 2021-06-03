package com.ilkertoksoz.vodafone.version;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@Validated
@RequestMapping("/version")
public interface CarTypeVersionedApi {

	@GetMapping(value = "/cars", params = "v1")
	ResponseEntity<String> getOneCarByProduceByVersionOne(@RequestParam("car-type")String carType);
}
