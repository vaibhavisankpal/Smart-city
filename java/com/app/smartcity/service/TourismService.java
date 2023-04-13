package com.app.smartcity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.smartcity.entity.Tourism;
import com.app.smartcity.repository.TourismRespository;

@Service
public class TourismService {
	@Autowired
     private TourismRespository tourismrespo;

	public Tourism addTourism(Tourism tourism) {
		// TODO Auto-generated method stub
		return tourismrespo.save(tourism);
	}
	

}
