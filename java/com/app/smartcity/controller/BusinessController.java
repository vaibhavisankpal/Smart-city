package com.app.smartcity.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
import com.app.smartcity.entity.Business;
import com.app.smartcity.entity.Tourism;
import com.app.smartcity.entity.User;
import com.app.smartcity.service.AdminService;
import com.app.smartcity.service.BusinessService;
import com.app.smartcity.service.TourismService;
import com.app.smartcity.service.UserService;

@Controller
@RequestMapping(value="business")
public class BusinessController {
	@Autowired
	private BusinessService businessService;
	@PostMapping(value ="/add")
	public ResponseEntity<Business> addbusiness(@RequestBody Business business) {
		return new ResponseEntity<Business>(businessService.addbusiness(business),HttpStatus.OK);
	}

	
}
