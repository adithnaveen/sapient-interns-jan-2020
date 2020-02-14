package com.company.springbootworks.swagger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	
	static ApiInfo apiInfo = new ApiInfo
			("In Sapient for Spring Boot App", "For Testing", 
					"1.0", "no service contract", 
					new Contact("Naveen", "http://ps.com", "naveen@probits.in"),
					"some licence", "http://somelicence.com", null); 
	
	@Bean
	@Qualifier(value = "swagger")
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo); 
	}
//	
//	
//	
//	return new Docket(DocumentationType.SWAGGER_2)  
//	          .select()                                  
//	          .apis(RequestHandlerSelectors.any())              
//	          .paths(PathSelectors.any())                          
//	          .build();     
//	
//	}
}
