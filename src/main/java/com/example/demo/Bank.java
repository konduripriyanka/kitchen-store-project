package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Bank {
	@Id
    private int bid;
    private double bamount;
}
