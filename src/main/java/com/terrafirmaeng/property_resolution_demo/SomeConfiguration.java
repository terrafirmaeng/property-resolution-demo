package com.terrafirmaeng.property_resolution_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SomeConfiguration {
	@Value("${value1}")
	private String value1;

	@Value("${value2}")
	private String value2;
}
