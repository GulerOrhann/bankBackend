package com.example.bankBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bankBackend.Entity.Exchange;



@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, Long>  {
	
	

}
