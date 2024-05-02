package com.example.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeValueController {

	@Autowired
	Environment environment;
	@Autowired
	private ExchangeValueRepository repository;
	
	Logger logger = LoggerFactory.getLogger(ExchangeValueController.class);

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue exchangeService(@PathVariable String from, @PathVariable String to) {
		
		//2024-05-01T09:13:40.876-07:00  INFO [currency-exchange-service,75be202d6e79245576070c162661d9c7,64a8ae857fbd3d56]  6304 --- [currency-exchange-service] [nio-8000-exec-1] [75be202d6e79245576070c162661d9c7-64a8ae857fbd3d56] c.e.m.c.ExchangeValueController          : exchangeService called with EUR to INR

		logger.info("exchangeService called with {} to {}", from,to);
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}
