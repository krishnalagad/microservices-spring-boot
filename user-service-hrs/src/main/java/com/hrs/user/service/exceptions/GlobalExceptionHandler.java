package com.hrs.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hrs.user.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {

		String message = ex.getMessage();
		ApiResponse response = ApiResponse.builder().message(message).isSuccess(false)
				.status(HttpStatus.NOT_FOUND).build();

		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}
