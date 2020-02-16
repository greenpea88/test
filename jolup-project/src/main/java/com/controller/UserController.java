package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.ResponseCode;
import com.service.UserService;


@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public @ResponseBody ResponseCode signup(@RequestParam("userId") String userId,
			@RequestParam("password") String password, @RequestParam("name") String name) throws Exception {
		return userService.signup(userId, password, name);
	}
}