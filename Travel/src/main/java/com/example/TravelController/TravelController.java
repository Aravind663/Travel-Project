package com.example.TravelController;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.TravelModel.Travel_model;
import com.example.TravelService.TravelService;

@RestController
@RequestMapping("/LPuser")
public class TravelController{
	
@Autowired
public TravelService lp_server;

@PostMapping("travel")
public String create(@RequestBody Travel_model lp_model)
{
return lp_server.addLPuser(lp_model);
}

@GetMapping("/get/{id}")
public Optional<Travel_model> getLPuser(@PathVariable("id") int id)
{
    return lp_server.yId(id);
}
@PutMapping("/Update_LPuser")
public String update(@RequestBody Travel_model lp_model)
{
return lp_server.updateLPuser(lp_model);
}
@DeleteMapping("/Delete_LPuser")
public String delete(@RequestParam ("LPid") int id)
{
return lp_server.deleteByRequestParamId(id);
}
}
