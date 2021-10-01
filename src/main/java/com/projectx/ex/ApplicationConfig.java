package com.projectx.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class ApplicationConfig {
	
	@Value("${app.name}")
	private String name;
	@Value("${app.version}")
	private String version;

}
