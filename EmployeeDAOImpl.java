package com.ems.dao.impl;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ems.dao.EmployeeDAO;
import com.ems.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	Scanner sc=null;
	List<Employee>addEmployees=new ArrayList<>();
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		int k=1;
		while(k==1)
		{
		System.out.println("Enter Employee Number :");
		int eno=sc.nextInt();
		System.out.println("Enter Employee Name :");
		String ename=sc.next();
		System.out.println("Enter Employee Address :");
		String eadd=sc.next();
		Employee employee=new Employee(eno,ename,eadd);
		addEmployees.add(employee);
		System.out.println("Employee Registered Successfully");
		System.out.println("Do you want to add one more record 1) Yes 2)No"); 
		k=sc.nextInt();
		
		}//end of while
		 
	}

	@Override
	public List<Employee> viewAllEmployees() {
		// TODO Auto-generated method stub
		return addEmployees;
	}
	@Override
	public Employee viewEmployee(int eno) {
		// TODO Auto-generated method stub
		
		for(Employee emp: addEmployees)
		{
			if (emp.getEno()==eno)
			{
				return emp;
			}
		}
		return null;
	}

	@Override
	public void deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		int j=0;
	for(Employee emp:addEmployees)
	{
		if(emp.getEno()==eno)
		{
			addEmployees.remove(emp);
		++j;
		}
	}
	
	if(j==0)
		System.out.println("Given number is not exist");
	else
		System.out.println("Employee Record Deleted Successfully");
	
	}
		
	@Override
	public void updateEmployee(int eno) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		int j=0;
		for(Employee emp: addEmployees)
		{
			if(emp.getEno()==eno)
			{
				++j;
				System.out.println("Do you want update Press 1) Ename 2)Eaddress");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter Employee Name");
				String name=sc.next();
				emp.setEname(name);
				System.out.println("Employee's name is updated successfully");
				break;
				case 2:
					System.out.println("Enter Employee Address");
					String eadd=sc.next();
					emp.setAddress(eadd);
					System.out.println("Employee address is upadted successfully");
					break;
			default:
				System.out.println("choose 1 to 2 between");
			
				}//end of switch
				
			}//end of if
		}
		if(j!=0)
			System.out.println("Given number is not exist");
		 
	}

}
