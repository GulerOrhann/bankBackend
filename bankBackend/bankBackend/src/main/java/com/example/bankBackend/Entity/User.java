package com.example.bankBackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)	
	   private long id;
	   
	   @Column(name="user_name")
	   private String userName;
	   
	   @Column(name="user_surname")
	   private String userSurname;
	   
	   @Column(name="cit_id")
	   private String citId;
	   
	   @Column(name="user_usd")
	   private String userUsd;
	   
	   @Column(name="user_euro")
	   private String userEuro;
	   
	   @Column(name="user_lira")
	   private String userLira;
	   

}
