package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao {
	
	@Autowired
	AdminRepo repoa;

	public Admin insertadmin(Admin a) {
		return repoa.save(a);
	}
	public List<Admin> getalladmin(){
		return repoa.findAll();
		
	}
}
