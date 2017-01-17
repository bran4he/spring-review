package com.tutorialspoint.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/father")
public class HelloController {

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "hello, little cat, this is SpringMVC!");
		return "hello";
	}
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}
}
