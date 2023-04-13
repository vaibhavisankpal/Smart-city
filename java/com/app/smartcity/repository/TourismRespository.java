package com.app.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.smartcity.entity.Tourism;

@Repository
public interface TourismRespository extends JpaRepository<Tourism, Integer>{

}
