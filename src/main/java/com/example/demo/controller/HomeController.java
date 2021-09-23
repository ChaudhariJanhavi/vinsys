package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.VinsysEmployee;
import com.example.demo.servicesInter.ServicesInterface;

@RestController
public class HomeController {
	
	@Autowired
	ServicesInterface se; 

	
	@PostMapping("/insert")
	public String registerData(@RequestBody() VinsysEmployee vs)
	{
		int id=se.saveData(vs);
		if(id>0)
		{
			return "Registered Successfully";
		}
		else
		{
			return "Not Registered Successfully";
		}
	}
	

	@GetMapping("/getdata")
	public List<VinsysEmployee> getdata(@RequestBody VinsysEmployee vse) {
		
		List<VinsysEmployee> ve=se.getdata(vse);
		return ve;
		
	}
	
	
	
	@DeleteMapping("/delete/{eid}")
	public String deleteData(@PathVariable("eid")int eid)
	{
	    
	     se.deleteData(eid);
	     return "delete record";
	}
	
	
	@PutMapping("/update")
	public VinsysEmployee updateData(@RequestBody() VinsysEmployee vs)
	{
		VinsysEmployee viss=se.updateData(vs);
		return viss;
	}


}
