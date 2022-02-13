package com.ems.dao;

import java.util.List;

import com.ems.pojo.Employee;


public interface EmployeeDAO{
public void addEmployee();
List<Employee>viewAllEmployees();
Employee viewEmployee(int eno);
void deleteEmployee(int eno);
void updateEmployee(int eno);
		
}

