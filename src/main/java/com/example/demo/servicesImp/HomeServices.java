package com.example.demo.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.VinsysEmployee;
import com.example.demo.repo.Daorepository;
import com.example.demo.servicesInter.ServicesInterface;

@Service
public class HomeServices implements ServicesInterface {


	@Autowired
	Daorepository da;
	
//	@Override
//	public void insertData(VinsysEmployee ve) {
//		 da.save(ve);
//		 
//		
//	}

	@Override
	public int saveData(VinsysEmployee vs) {
		VinsysEmployee vis=da.save(vs);
		return vis.getEid();
	}



	@Override
	public void deleteData(int eid) {
		da.deleteById(eid);
		
	}

	@Override
	public VinsysEmployee updateData(VinsysEmployee vs) {
		VinsysEmployee vss=da.saveAndFlush(vs);
		return vss;
	}



	@Override
	public List<VinsysEmployee> getAllData(String empName, String empEmail) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<VinsysEmployee> getsingaleData(String empName, String empEmail) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public List<VinsysEmployee> getdata(VinsysEmployee vse) {
		List<VinsysEmployee> vsr=da.findAll();
		return vsr;
	}
	
		
	
	
	
	
	
	

}
