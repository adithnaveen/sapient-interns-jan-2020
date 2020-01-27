package com.sapient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloWorld.class);

		System.out.println("hi");
		logger.info("hello world from Java - logger info");
		logger.error("hello from logger error");

		System.out.println("bye.. ");
	}
}
