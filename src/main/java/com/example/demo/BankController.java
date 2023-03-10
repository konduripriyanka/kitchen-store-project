package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@Autowired
	BankDao dao;
	
	@PostMapping("/inserttobank")
	public Bank insert(@RequestBody Bank b) {
		return dao.insert(b);
	}

}
