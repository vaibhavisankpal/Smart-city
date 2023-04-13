package com.app.smartcity.service;

import java.io.IOException;

import org.springframework.aop.config.AopNamespaceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.smartcity.entity.Places;
import com.app.smartcity.repository.placeRepository;
@Service
public class PlaceService {
	@Autowired
	private placeRepository pRepo;

	/*
	 * public Places addPlace(MultipartFile file) throws IOException { // TODO
	 * Auto-generated method stub //String fname= file.getOriginalFilename();
	 * //Places p=new Places(file.getContentType(),fname,file.getBytes()); //return
	 * pRepo.save(p); }
	 */

}
