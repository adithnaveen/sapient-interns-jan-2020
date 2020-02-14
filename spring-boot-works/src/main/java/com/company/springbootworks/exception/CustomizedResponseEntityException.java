package com.company.springbootworks.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class CustomizedResponseEntityException extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(UserNotFoundException.class)
	
	public ResponseEntity<Object> 
		handleUserNotFoundException(Exception ex, WebRequest webRequest)
				throws UserNotFoundException{
		
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(ex.getMessage(),
							"http://localhost:9090/emps/{empId}", new Date()); 
		
		
		return new ResponseEntity<Object>(exceptionResponse,
					HttpStatus.INTERNAL_SERVER_ERROR); 
		
		
	}
	
	

	@ExceptionHandler(Exception.class)
	
	public ResponseEntity<Object> 
		handleAllException(Exception ex, WebRequest webRequest)
				throws Exception{
		
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(ex.getMessage(),
							"Please contact team for more information on error",
							new Date()); 
		
		
		return new ResponseEntity<Object>(exceptionResponse,
					HttpStatus.INTERNAL_SERVER_ERROR); 
		
		
	}
}










