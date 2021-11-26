package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView sayHello(ModelAndView mav) {
		System.out.println("I Came Here");
		//ModelAndView mav =  new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	}
	@RequestMapping(value = "check",method = RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req,ModelAndView mav) {		// DI for Request Object 
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		if(user.equals("Raj") && pass.equals("123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	
	
}
