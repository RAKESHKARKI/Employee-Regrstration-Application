package com.ems.details;

import java.util.List;
import java.util.Scanner;

import com.ems.client.EmployeeClient;
import com.ems.dao.EmployeeDAO;
import com.ems.dao.impl.EmployeeDAOImpl;
import com.ems.pojo.Employee;

public class EmployeeDetails {
	Scanner sc=new Scanner(System.in);
	  EmployeeDAO daoImpl=new EmployeeDAOImpl();
	  
	public void employeeDetails()
	{
		
		while(true)
		{
		System.out.println("********************************************");
		System.out.println("                   1)AddEmployee            ");
		System.out.println("                   2)ViewAllEmployee        ");
		System.out.println("                   3)ViewEmployee           ");
		System.out.println("                   4)UpdateEmployee         ");
		System.out.println("                   5)DeleteEmployee         ");
		System.out.println("                   6)Back                   ");
		System.out.println("********************************************");
		
	System.out.println("Enter the Choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		daoImpl.addEmployee();
		employeeDetails();
		break;
	case 2:
		List<Employee>viewEmployees=daoImpl.viewAllEmployees();
		System.out.println(" ENO\t ENAME \tEADD");
		System.out.println("****************************************");
		for(Employee emp: viewEmployees)
		{
			System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getAddress());
		}
		employeeDetails();
		break;
	case 3:
		System.out.println("Enter Employee Number :");
		Employee emp=daoImpl.viewEmployee(sc.nextInt());
		System.out.println("********************************************");
		
		System.out.println(" ENO\t ENAME \tEADD");
		System.out.println("****************************************");
		
		if(emp!=null)
			System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getAddress());
		else
			System.out.println("Employee Record Not Exist");
		
		employeeDetails();
		break;
		
	case 4:
		System.out.println("Enter Employee Number :");
		
		daoImpl.updateEmployee(sc.nextInt());
		employeeDetails();
		break;
	case 5:
		System.out.println("Enter Employee Number :");
		daoImpl.deleteEmployee(sc.nextInt());
		employeeDetails();
		break;
	case 6:
		EmployeeClient.main(null);
			default:
				System.out.println("Choose 1 to 6 Between");
}//end of choice switch

	}//end of while
	
		}//end of switch
		
	}

