package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bank;

@Service
public class BankDao {
	@Autowired
	BankRepo repob;
	
	public Bank insert(Bank b) {
		return repob.save(b);
	}
	

}
