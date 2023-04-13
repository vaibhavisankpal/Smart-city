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
import org.springframework.web.multipart.MultipartFile;

import com.app.smartcity.entity.Places;
import com.app.smartcity.service.PlaceService;



@Controller
@RequestMapping(value="Place")
public class placeController {
	@Autowired
	private PlaceService placeService;
	/*
	 * @PostMapping(value ="/add") public Places addPlace(@RequestParam("file")
	 * MultipartFile file)throws Exception { return placeService.addPlace(file); }
	 */

	
}
