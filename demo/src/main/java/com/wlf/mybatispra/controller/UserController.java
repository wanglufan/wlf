package com.wlf.mybatispra.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wlf.mybatispra.bean.User;
import com.wlf.mybatispra.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value= "/select" , method = RequestMethod.POST )
	public List<User> showUser(@RequestParam("username") String username) {
		return userService.showUser(username);
	}
	
	@RequestMapping(value = "/insert" ,method = RequestMethod.GET)
	public int insertUser(User user) {
		return userService.insertUser(user);
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public int updateUser(User user) {
		return userService.updateUser(user);
		
	}
	@RequestMapping(value = "/delete" , method = RequestMethod.GET)
	public int deleteUser(@RequestParam("id") int id) {
		return userService.deleteUser(id);
	}

}
