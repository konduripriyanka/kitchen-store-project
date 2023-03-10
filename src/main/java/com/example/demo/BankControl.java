package com.example.demo;

import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BankControl {
	
	@Autowired
	BankDao dao;
	
	@RequestMapping("/insertbank")
	public ModelAndView inserttobank(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Bank b=new Bank();
		
	    b.setBamount(Double.parseDouble(request.getParameter("bamount")));
	    double bamount=b.getBamount();
	    
	    if(bamount<10000) 
	    {
	    	mv.setViewName("successbank.jsp");
	    }
	    else {
	    	mv.setViewName("fail.jsp");
	    }
	    
		return mv;
}
	

}
