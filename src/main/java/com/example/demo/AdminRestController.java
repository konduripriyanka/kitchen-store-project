package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRestController {
	@Autowired
	AdminDao dao;
	
	@PostMapping("/insertadmin")
	public Admin insert(@RequestBody Admin a) {
		return dao.insertadmin(a);
	}
	@GetMapping("/getalladmin")
	public List<Admin> getall(){
		 return dao.getalladmin();
	}

}
