package com.xworkz.ott.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactController {

	public ContactController() {
		System.out.println("Created ContactController");
	}
	
	@PostMapping("/contact.do")
	private String onContact() {
		System.out.println("onContact Method is Calling");
		return "contact.html";
	}

}
