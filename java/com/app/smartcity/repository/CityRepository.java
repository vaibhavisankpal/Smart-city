package com.app.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.smartcity.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
