package com.ecommerce.configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer{
	
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	            .allowedOrigins("*")  // You can specify specific origins here
	            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
	            .allowedHeaders("*")
	            .allowCredentials(true)
	            .maxAge(3600);
	    }

}
