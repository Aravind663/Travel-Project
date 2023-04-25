package com.example.TravelRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.TravelModel.Travel_model;
@Repository
public interface TravelRepo extends JpaRepository<Travel_model,Integer>{

}
