package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KitchenController {
	@Autowired
	KitchenDao dao;
	
	private final String Folder_Path="C:\\kitchenimages\\";
	
	@RequestMapping("/")
	public ModelAndView indexxx(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/inserttokitem")
	public ModelAndView insertitem(HttpServletRequest request,HttpServletResponse response,
			@RequestParam ("ktname") String name,
			@RequestParam("ktprice") String ktprice,
			@RequestParam("file") MultipartFile file) {
		ModelAndView mv=new ModelAndView();
		
		Kitchenitems kt=new Kitchenitems();
		
		kt.setName(name);
		kt.setKtprice(ktprice);
		String fileinfo=Folder_Path+file.getOriginalFilename();
		kt.setFilepath(fileinfo);
		
		Kitchenitems kti=dao.insertitem(kt);
		if(kti!=null) {
			mv.setViewName("successinsert.jsp");
		}
		return mv;	
	}
	
	@RequestMapping("/getallkitchenitemsadmin")
	public ModelAndView displayall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<Kitchenitems> list=dao.getallitems();
		mv.addObject("list", list);
		mv.setViewName("kitchenitemlistadmin.jsp");
		
		return mv;
	}

	@RequestMapping("/getallkitchenitemsuser")
	public ModelAndView displayalluser(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<Kitchenitems> list=dao.getallitems();
		mv.addObject("list", list);
		mv.setViewName("kitchenitemlistuser.jsp");
		
		return mv;
	}
	@RequestMapping("/searchlist")
	public ModelAndView displaysearch(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String keyword=request.getParameter("keyword");
		List<Kitchenitems> list=dao.searchList(keyword);
		mv.addObject("list", list);
		mv.setViewName("kitchenitemlistuser1.jsp");
		
		return mv;
	}
	
	
	@RequestMapping("/deleteitem")
	public ModelAndView deleteitem(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		
		Kitchenitems kt=new Kitchenitems();
		kt.setKid(Integer.parseInt(request.getParameter("ktid")));
		dao.deletebyid(kt);
		mv.setViewName("successinsert.jsp");
		return mv;
		
	}
	@RequestMapping("/updateitem")
	public ModelAndView updateitem(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		
		Kitchenitems kt=new Kitchenitems();
		
		kt.setName(request.getParameter("name"));
		kt.setKtprice(request.getParameter("ktprice"));
		
		Kitchenitems kti=dao.updatebyname(kt);
		if(kti!=null) {
			mv.setViewName("successupdate.jsp");
		}
		return mv;
	}
}
