package com.example.bankBackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bankBackend.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;

}
