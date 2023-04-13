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

import com.app.smartcity.dto.AdminRequest;
import com.app.smartcity.dto.AdminResponse;
import com.app.smartcity.dto.UserRequest;
import com.app.smartcity.dto.UserResponse;
import com.app.smartcity.entity.Admin;
import com.app.smartcity.entity.User;
import com.app.smartcity.service.AdminService;
import com.app.smartcity.service.UserService;

@Controller
@RequestMapping(value="admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	Logger logger=LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping(value = "/add",method = RequestMethod.POST,
			consumes = "application/json",produces = "application/json")
	//add user details
	public ResponseEntity<AdminResponse>addAdmin(@RequestBody AdminRequest request){
		logger.info("AdminController class start addUser() merhod request is.."+request);
		AdminResponse response=adminService.addAdmin(request);
		logger.info("AdminController class end addUser() merhod response is.."+response);
		return new ResponseEntity<AdminResponse>(response,HttpStatus.CREATED);
		
		
	}
	//Show user details
	@RequestMapping(value = "/list",method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<List<Admin>>getAdmin(){
	logger.info("AdminController class start getUser() merhod request is..");
	List<Admin> response=adminService.getAdmin();
	logger.info("AdminController class end addUser() merhod response is.."+response);
	return new ResponseEntity<List<Admin>>(response,HttpStatus.OK);
	}
	
  //Login Request
	
	@RequestMapping(value = "/login",method = RequestMethod.POST,
			consumes = "application/json",produces = "application/json")
	public ResponseEntity<AdminResponse>login(@RequestBody AdminRequest request){
		logger.info("AdminController class start Login() merhod request is.."+request);
		AdminResponse response=adminService.login(request);
		logger.info("AdminController class end Login() merhod response is.."+response);
		return new ResponseEntity<AdminResponse>(response,HttpStatus.OK);
		
		
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<Admin>updateAdmin(@RequestParam int id,@RequestBody AdminRequest request ){
		return new ResponseEntity<Admin>(adminService.updateAdmin(id,request), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete")
	public void deleteAdmin(@RequestParam int id){
		
		adminService.deleteAdmin(id);
		System.out.println("removed successfully");
	}

}
