package com.app.smartcity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.smartcity.entity.City;
import com.app.smartcity.service.CityService;

@RestController
@RequestMapping(value = "/city")
public class CityController {
	@Autowired
	private CityService cityService;
	@PostMapping(value ="/add")
	public ResponseEntity<List<City>> addCity(@RequestBody List<City> cities) {
		return new ResponseEntity<List<City>>(cityService.addCity(cities), HttpStatus.OK);
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}


	

}
