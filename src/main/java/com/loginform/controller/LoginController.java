package com.loginform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.loginform.entity.Login;
import com.loginform.repository.LoginRepository;

@Controller
public class LoginController {
	@Autowired
	private LoginRepository loginRepo;
	
	@RequestMapping("/viewloginpage")
	public String viewLoginPage() {
		return "login";
	}
	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap model) {
		Login login = loginRepo.findByEmail(email);
		if(login != null) {
			if(login.getEmail().equals(email) && login.getPassword().equals(password)) {
				model.addAttribute("msg", "Login is sucessful!");
				return "login";
			}
		}
		model.addAttribute("error", "Invalid username (OR) password");
		return "login";
	}

}
