package com.app.smartcity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.smartcity.entity.City;
import com.app.smartcity.repository.CityRepository;

@Service
public class CityService {
	@Autowired
	private CityRepository cityRepo;

	public List<City> addCity(List<City> city) {
		// TODO Auto-generated method stub
		List<City> response = new ArrayList<City>();
		City city2 = null;
		for (City c : city) {
			city2 = new City();
			city2 = cityRepo.save(c);
			response.add(city2);
		}

		return response;

	}
}
