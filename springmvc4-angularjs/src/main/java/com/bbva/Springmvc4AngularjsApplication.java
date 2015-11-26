package com.bbva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Springmvc4AngularjsApplication 
	extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder 
	configure(SpringApplicationBuilder application) {
		return application.sources(Springmvc4AngularjsApplication.class);
	}
	
	
    public static void main(String[] args) {
        SpringApplication.run(Springmvc4AngularjsApplication.class, args);
    }
}
