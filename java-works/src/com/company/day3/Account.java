package com.company.day3;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Account implements Serializable {
	private int accId; 
	private double accBalance; 
	private String accHolderName;
	
}
