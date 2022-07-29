package com.thales.iconicframes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {

	@RequestMapping("/accueil")
	public String accueil() {
		return "index/accueil";
	}
}
