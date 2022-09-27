package com.example.bankBackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exchange")
public class Exchange {
	
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)	
	   private long id;
	   
	   @Column(name="cur_name")
	   private String userName;
	   
	   
	   @Column(name="cur_value")
	   private String curValue;
	   
	   
}
