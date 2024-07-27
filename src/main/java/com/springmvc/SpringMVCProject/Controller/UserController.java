package com.springmvc.SpringMVCProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.SpringMVCProject.entity.User;

@Controller
public class UserController {

	@GetMapping("/all")
	public String getLogin()
	{
		System.out.println("I am in login page");
		return "login";
	}
	
	@GetMapping("/aa")
	public String getUsername(@RequestParam String username)
	{
		System.out.println(username);
		return "Profile";
	}
	@GetMapping("/data")
	public String getdata(@ModelAttribute User user)
	{
		System.out.println("THis is object method");
		System.out.println(user);
		return "Profile";
	}
	
}
