package com.es.spring.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.MediaType;

public class CustomRepositoryRestConfigurerAdapter extends RepositoryRestConfigurerAdapter {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setBasePath("api");
		config.setDefaultMediaType(MediaType.APPLICATION_JSON);
		config.setDefaultPageSize(5);
		
		super.configureRepositoryRestConfiguration(config);
	}

}