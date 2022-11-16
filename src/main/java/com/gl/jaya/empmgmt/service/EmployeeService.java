package com.gl.jaya.empmgmt.service;

import java.util.List;

import com.gl.jaya.empmgmt.entity.Employee;
import com.gl.jaya.empmgmt.entity.Role;
import com.gl.jaya.empmgmt.entity.User;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void save(Employee theEmployee);

	public void deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstNameAsc();

	public User saveUser(User user);

	public Role saveRole(Role role);

	public List<Employee> getEmployeesSortedByName(String direction);
}
