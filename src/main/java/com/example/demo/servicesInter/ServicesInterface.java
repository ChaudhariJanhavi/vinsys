package com.example.demo.servicesInter;

import java.util.List;

import com.example.demo.model.VinsysEmployee;

public interface ServicesInterface {

	//void insertData(VinsysEmployee ve);

	int saveData(VinsysEmployee vs);

	List<VinsysEmployee> getAllData(String empName, String empEmail);

	List<VinsysEmployee> getsingaleData(String empName, String empEmail);

	void deleteData(int eid);

	VinsysEmployee updateData(VinsysEmployee vs);

	List<VinsysEmployee> getdata(VinsysEmployee vse);

}
