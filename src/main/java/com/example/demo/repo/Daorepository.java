package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.VinsysEmployee;

@Repository
public interface Daorepository extends JpaRepository<VinsysEmployee, Integer > {

	List<VinsysEmployee> findByEmpNameAndEmpEmail(String empName, String empEmail);

}
