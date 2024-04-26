package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExchangeValueController {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue exchangeService(@PathVariable String from, @PathVariable String to) {
		return new ExchangeValue(100L, from, to, BigDecimal.valueOf(65));
	}
}