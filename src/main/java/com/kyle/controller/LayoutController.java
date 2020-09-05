package com.kyle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LayoutController {
	
	@GetMapping(value = "/mainlayout")
    public ModelAndView show() {
    	return new ModelAndView("layout");
    }
}
