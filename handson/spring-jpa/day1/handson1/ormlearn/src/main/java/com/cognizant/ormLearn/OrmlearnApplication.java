package com.cognizant.ormLearn;
import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormLearn.model.Country;
import com.cognizant.ormLearn.service.CountryService;


@SpringBootApplication
public class OrmlearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmlearnApplication.class);
	private static CountryService countryService;
	
	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmlearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		testGetAllCountries();
		LOGGER.info("Inside main");
	}

}
