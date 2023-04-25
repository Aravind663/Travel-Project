package com.example.TravelService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TravelModel.Travel_model;
import com.example.TravelRepository.TravelRepo;

@Service
public class TravelService {
	
	@Autowired
	TravelRepo rep;
	
	public String addLPuser(Travel_model tm)
	{
	rep.save(tm);
	return "Added a LP User!";
	}
	
	public List<Travel_model> getLPuser()
	{
	return rep.findAll();
	}
	
	public Optional<Travel_model>yId(int id)
	{
	return rep.findById(id);
	}
	
	public String updateLPuser(Travel_model tm)
	{
         rep.save(tm);
	return "Updated a LP User!";
	}
	public String deleteByRequestParamId(int id)
	{
	  rep.deleteById(id);
	return "Deleted a LP User!";
	}
	}
