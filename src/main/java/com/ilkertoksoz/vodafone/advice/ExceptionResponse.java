package com.ilkertoksoz.vodafone.advice;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author ilker
 * @version 0.1.0
 * @since 0.1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

	private LocalDateTime date;
	private String message;
}