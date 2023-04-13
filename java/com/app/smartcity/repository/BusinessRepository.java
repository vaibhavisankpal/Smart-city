package com.app.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.smartcity.entity.Business;

@Repository
public interface BusinessRepository extends JpaRepository<Business, String>{

}
