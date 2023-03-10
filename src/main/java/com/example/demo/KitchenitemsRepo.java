package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface KitchenitemsRepo extends JpaRepository<Kitchenitems, Integer>{
	@Query("select k from Kitchenitems k where k.name LIKE %?1%")
	public List<Kitchenitems> serachList(String keyword);
	
	
}
