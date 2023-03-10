package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Kitchenitems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int kid;
	private String name;
	private String ktprice;
	private String filepath;
	

}
