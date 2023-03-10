package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@Autowired
	UserDao dao;
	
	@RequestMapping("/insertuser")
	public ModelAndView inserttouser(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u=new User();
		
		u.setUfname(request.getParameter("ufname"));
		String ufname=u.getUfname();
		
		u.setUpassword(request.getParameter("upassword"));
		String upassword=u.getUpassword();
		
		u.setUlname(request.getParameter("ulname"));
		u.setUemail(request.getParameter("uemail"));
		u.setUdob(request.getParameter("ubod"));
		
		if(ufname.equals(upassword)) {
			mv.setViewName("listofkitchenitems.jsp");
		}
		else {
			String msg="Register first....";
			mv.addObject("msg",msg);
			mv.setViewName("userlogin.jsp");
		}
		
		return mv;
	}

}
