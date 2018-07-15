package in.apedusoft.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.apedusoft.ems.dto.User;

@Controller
public class LoginController {
	
	@RequestMapping(value="/")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("loginForm", new User());
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(@ModelAttribute("loginForm") User userForm, BindingResult bindingResult, Model model) {
		System.out.println(" Login Controller value :: "+userForm);
		
	}
	
	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
	public String accessDenied() {
		return "access_denied";
	}

}
