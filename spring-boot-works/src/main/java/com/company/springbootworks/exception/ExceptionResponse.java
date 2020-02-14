package com.company.springbootworks.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionResponse {
	private String message; 
	private String details; 
	private Date timeStamp; 
}
