package com.app.smartcity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.smartcity.dto.AllType;
import com.app.smartcity.repository.AdminRepository;
import com.app.smartcity.repository.BusinessRepository;
import com.app.smartcity.repository.CityRepository;
import com.app.smartcity.repository.TourismRespository;
import com.app.smartcity.repository.UserRepository;
import com.app.smartcity.repository.placeRepository;
@Service
public class HistoryService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AdminRepository adminRepo;
	@Autowired
	private BusinessRepository businessRepo;
	@Autowired
	private CityRepository cityRepo;
	@Autowired
	private placeRepository pRepo;
	@Autowired
    private TourismRespository tourismrespo;

	public AllType getInfo() {
		// TODO Auto-generated method stub
		AllType all=new AllType(userRepository.findAll(),adminRepo.findAll(),cityRepo.findAll(),businessRepo.findAll(),pRepo.findAll(),tourismrespo.findAll());
		return all;
	}

}
