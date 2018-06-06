package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller	
public class PageController {
	
//	@RequestMapping(value= {"/","/home","/index"})
//	 public ModelAndView index() {
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("gretting","welcome to spring MVC");
//		return mv;
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {		
		ModelAndView mv = new ModelAndView("page");	
		mv.addObject("greeting","Home mvc");
		return mv;
	}


}
