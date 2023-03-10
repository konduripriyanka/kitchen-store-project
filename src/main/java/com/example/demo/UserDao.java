package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {
	
	@Autowired
	UserRepo repou;
	
	public User insert(User u) {
		return repou.save(u);
	}
	
	public List<User> getall(){
		return repou.findAll();
	}
	

}
