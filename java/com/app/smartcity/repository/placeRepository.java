package com.app.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.smartcity.entity.Places;

@Repository
public interface placeRepository extends JpaRepository<Places, String> {

}
