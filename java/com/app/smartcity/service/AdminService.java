package com.app.smartcity.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.smartcity.dto.AdminRequest;
import com.app.smartcity.dto.AdminResponse;
import com.app.smartcity.dto.UserResponse;
import com.app.smartcity.entity.Admin;
import com.app.smartcity.entity.User;
import com.app.smartcity.repository.AdminRepository;


@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepo;
   
	Logger logger=LoggerFactory.getLogger(AdminService.class);
	
	AdminResponse adminResponse=new AdminResponse();
	
	public AdminResponse addAdmin(AdminRequest request) {
		// TODO Auto-generated method stub
		logger.info("AdminService class start addUser() merhod request is.."+request);
		
		Admin admin = CreateUserObject(request);
		Admin a =	adminRepo.save(admin);
	if(a!=null) {
		adminResponse.setResponse(a);
		adminResponse.setStatus("Successfully added admin in database...!");
	}else {
		adminResponse.setResponse(admin);
		adminResponse.setStatus("Fail to added admin in database...!");
	}
		logger.info("AdminService class start addUser() merhod response is.."+adminResponse);
		return adminResponse;
	
	
	}
	
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}


	

	private Admin CreateUserObject(AdminRequest request) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setAddress(request.getAddress());
		admin.setAge(request.getAge());
		admin.setDob(request.getDob());
		admin.setEmail(request.getEmail());
		admin.setName(request.getName());
		admin.setPassword(request.getPassword());
		return admin;
	}

	public AdminResponse login(AdminRequest request) {
		// TODO Auto-generated method stub
		Admin admin=adminRepo.findByEmailAndPassword(request.getEmail(),request.getPassword());
		if(admin!=null) {
			adminResponse.setResponse(admin);
			adminResponse.setStatus("login Successfully!");
		}else {
			adminResponse.setResponse(admin);
			adminResponse.setStatus("invalid username and password");
		}
		return adminResponse;
	}

	public Admin updateAdmin(int id, AdminRequest request) {
		// TODO Auto-generated method stub
		Admin response=adminRepo.findById(id).get();
		Admin p=null;
		if(response!=null) {
			response.setEmail(response.getEmail());
			response.setPassword(response.getPassword());
			p=adminRepo.save(response);
			
		}
	return p;
	}

	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		adminRepo.deleteById(id);
	}




	

	
}
