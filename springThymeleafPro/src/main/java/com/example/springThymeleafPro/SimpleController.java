package com.example.springThymeleafPro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SimpleController {
	String appName;
	
	public String homePage(Model model) {
		model.addAttribute("appName",appName);
		return "homee";
	}

	
}
