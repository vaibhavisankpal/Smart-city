package com.app.smartcity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.smartcity.entity.Business;
import com.app.smartcity.repository.BusinessRepository;

@Service
public class BusinessService {
	

	@Autowired
	private BusinessRepository businessRepo;
	
	public Business addbusiness(Business business) {
		// TODO Auto-generated method stub
		return businessRepo.save(business);
	}

}
