package com.company04.autowire;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

@Component
public class Camera {
	private String cameraType; 
	private int resoluation;

}
