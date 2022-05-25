package com.player.data.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.data.Model.User;
import com.player.data.Service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
	@CrossOrigin (origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		
		String temusername = user.getUsername();
		
		if(temusername != null && "".equals(temusername)) {
			
			User userobj = service.fetchUserbyUsername(temusername);
			if(userobj != null) {
				throw new Exception("User With "+temusername+" is already exists");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception{
		
		String tempUsername = user.getUsername();
		String tempPassword = user.getPassword();
		
		User userObj = null;
		
		if(tempUsername != null && tempPassword != null) {
			userObj = service.fetchUserbyUsernameAndPassword(tempUsername, tempPassword);
		}
		if(userObj == null) {
			throw new Exception("Bad Credentials");
			
		}
		return userObj;
	}

}
