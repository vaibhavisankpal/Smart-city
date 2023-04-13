package com.app.smartcity.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.smartcity.dto.UserRequest;
import com.app.smartcity.dto.UserResponse;
import com.app.smartcity.entity.User;
import com.app.smartcity.service.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/add",method = RequestMethod.POST,
			consumes = "application/json",produces = "application/json")
	//add user details
	public ResponseEntity<UserResponse>addUser(@RequestBody UserRequest request){
		logger.info("UserController class start addUser() merhod request is.."+request);
		UserResponse response=userService.addUser(request);
		logger.info("UserController class end addUser() merhod response is.."+response);
		return new ResponseEntity<UserResponse>(response,HttpStatus.CREATED);
		
		
	}
	//Show user details
	@RequestMapping(value = "/list",method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<List<User>>getUser(){
	logger.info("UserController class start getUser() merhod request is..");
	List<User> response=userService.getUser();
	logger.info("UserController class end addUser() merhod response is.."+response);
	return new ResponseEntity<List<User>>(response,HttpStatus.OK);
	}
	
  //Login Request
	
	@RequestMapping(value = "/login",method = RequestMethod.POST,
			consumes = "application/json",produces = "application/json")
	public ResponseEntity<UserResponse>login(@RequestBody UserRequest request){
		logger.info("UserController class start Login() merhod request is.."+request);
		UserResponse response=userService.login(request);
		logger.info("UserController class end Login() merhod response is.."+response);
		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
		
		
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<User>Updateuser(@RequestBody int id,UserRequest request ){
		return new ResponseEntity<User>(userService.Updateuser(id,request), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete")
	public void deleteUser(@RequestParam int id){
		
		userService.deleteuser(id);
		System.out.println("removed successfully");
	}

}
