package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class home {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String landingpage()
	{
		return "Index";
	}
@RequestMapping(value="/login",method=RequestMethod.GET)
public String EndPage(Model model)
{
	model.addAttribute("message", "Welcome to Spring Framework");
	return "end";
}}