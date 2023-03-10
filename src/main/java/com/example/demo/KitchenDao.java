package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitchenDao {
	
	@Autowired
	KitchenitemsRepo repok;
	
	public Kitchenitems insertitem(Kitchenitems kt) {
		return repok.save(kt);
	}
	
	public List<Kitchenitems> getallitems(){
		return repok.findAll();
	}
	
	public void deletebyid(Kitchenitems kt) {
	     repok.delete(kt);

	}
	
	public Kitchenitems updatebyname(Kitchenitems kt) {
		Kitchenitems kts=repok.findById(kt.getKid()).orElse(null);
		
		kts.setName(kt.getName());
		kts.setKtprice(kt.getKtprice());
		return repok.save(kts);
	}
	
	public List<Kitchenitems> searchList(String keyword) {
		return repok.serachList(keyword);
				
	}

	
	

}
