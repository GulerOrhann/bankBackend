package com.example.bankBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankBackend.Entity.Exchange;
import com.example.bankBackend.Repository.ExchangeRepository;



@Service
public class ExchangeService {
	
	@Autowired
	private ExchangeRepository exchangeRepo;
	
	
   public List<Exchange> getAllExchange() {
		
		return exchangeRepo.findAll();
		//get All
	}

}
