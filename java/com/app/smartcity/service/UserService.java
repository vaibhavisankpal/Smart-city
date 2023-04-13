package com.app.smartcity.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.smartcity.dto.UserRequest;
import com.app.smartcity.dto.UserResponse;
import com.app.smartcity.entity.User;
import com.app.smartcity.repository.UserRepository;
import com.app.smartcity.service.UserService;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	Logger logger=LoggerFactory.getLogger(UserService.class);
	
	UserResponse userResponse=new UserResponse();
	
	public UserResponse addUser(UserRequest request) {
		// TODO Auto-generated method stub
		logger.info("UserService class start addUser() merhod request is.."+request);
		
		User user = CreateUserObject(request);
	User u=	userRepo.save(user);
	if(u!=null) {
		userResponse.setResponse(u);
		userResponse.setStatus("Successfully added user in database...!");
	}else {
		userResponse.setResponse(user);
		userResponse.setStatus("Fail to added user in database...!");
	}
		logger.info("UserService class start addUser() merhod response is.."+userResponse);
		return userResponse;
	}
	
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	public UserResponse login(UserRequest request) {
		// TODO Auto-generated method stub
		User user=userRepo.findByEmailAndPassword(request.getEmail(),request.getPassword());
		if(user!=null) {
			userResponse.setResponse(user);
			userResponse.setStatus("login Successfully!");
		}else {
			userResponse.setResponse(user);
			userResponse.setStatus("invalid username and password");
		}
		return userResponse;
	}
	/**
	 * @param request
	 * @return
	 */
	private User CreateUserObject(UserRequest request) {
		User user=new User();
		user.setAddress(request.getAddress());
		user.setAge(request.getAge());
		user.setDob(request.getDob());
		user.setEmail(request.getEmail());
		user.setuName(request.getName());
		user.setPassword(request.getPassword());
		return user;
	}

	public User Updateuser(int id, UserRequest request) {
		// TODO Auto-generated method stub
			User response=userRepo.findById(id).get();
			User p=null;
			if(response!=null) {
				response.setEmail(response.getEmail());
				response.setPassword(response.getPassword());
				p=userRepo.save(response);
				
			}
		return p;
	}

	public void deleteuser(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		
	}

	

}
