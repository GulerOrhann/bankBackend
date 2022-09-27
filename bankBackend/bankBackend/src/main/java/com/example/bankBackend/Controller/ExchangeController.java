package com.example.bankBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankBackend.Entity.Exchange;
import com.example.bankBackend.Service.ExchangeService;

@RestController
@RequestMapping("/bank/exchange")
public class ExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;
	
	@GetMapping("/all")
	public List<Exchange> showAllExchange() {
		return exchangeService.getAllExchange();
	}

}
