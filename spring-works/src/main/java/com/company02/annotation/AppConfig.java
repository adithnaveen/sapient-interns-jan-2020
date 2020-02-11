package com.company02.annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Required
	@Bean(name = "english")
	public Greeting english() {
		return new GreetEnglish();
	}

	@Required
	@Bean(name = "french")
	public Greeting french() {
		return new GreetFrench();
	}

}
