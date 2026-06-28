package com.kodnest.OTPAuthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController{
	
	@Autowired
	UserService service;
	
	@RequestMapping("/")
	String home() {
		return "index";
	}
	
	@RequestMapping("/login")
	String login() {
		return "login";
	}
	
	@RequestMapping("/Register")
	String registerUser(@RequestParam("un") String name, @RequestParam("ua") String age, @RequestParam("ue") String email, @RequestParam("up")String phone, @RequestParam("upwd") String password) {
		AppUser user = new AppUser(name, age, email, phone, password);
		AppUser savedUser = service.registerUser(user);
		if(savedUser != null) {
			return "login";
		}
		return "index";
	}
	
	@RequestMapping("/loginuser")
	String loginUser(@RequestParam("un") String name, @RequestParam("upwd") String password) {
		boolean isuser = service.loginUser(name, password);
		if(isuser) {
			return "otp";
		}else {
			return "login";
		}
	}
	
	@RequestMapping("/verifyotp")
	String verify(@RequestParam("uotp") String otp) {
		boolean res = service.verifyOtp(otp);
		if(res) {
			return "dashboard";
		}
		else {
			return "otp";
		}
	}
	
	
	
	
	
}