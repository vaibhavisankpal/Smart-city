package com.app.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.smartcity.entity.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	Admin findByEmailAndPassword(String email, String password);


	

}
