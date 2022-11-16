package com.gl.jaya.empmgmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.jaya.empmgmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();
}