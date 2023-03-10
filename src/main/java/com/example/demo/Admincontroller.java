package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admincontroller {
	
	@Autowired
	AdminDao dao;
	
	@RequestMapping("/inserttoadmin")
	public ModelAndView insertadmin(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	    Admin a=new Admin();
	    a.setAname(request.getParameter("aname"));
	    String aname=a.getAname();
	    a.setApassword(request.getParameter("apassword"));
	    String apassword=a.getApassword();
	    
	    
	    if(aname.equals(apassword)) {
	    	mv.setViewName("insertkitchenitem.jsp");
	    }
	    else {
	    	String msg="Incorrect password...";
	    	mv.addObject("msg",msg);
	    	mv.setViewName("adminlogin.jsp");
	    }
	    return mv;
	}
}
