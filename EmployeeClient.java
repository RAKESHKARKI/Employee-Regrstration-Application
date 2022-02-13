package com.ems.client;

import java.util.Scanner;

import com.ems.details.EmployeeDetails;

public class EmployeeClient {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			while(true)
			{
			System.out.println("********************************************");
			System.out.println("                   1)Employee               ");		
			System.out.println("                   6)Exit                   ");
			System.out.println("********************************************");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			 
			switch(choice)
			{
				case 1:
					EmployeeDetails details=new EmployeeDetails();
					details.employeeDetails();
					break;
				case 2:
					System.out.println("Thank you for using app!");
					System.exit(0);
					default:
						System.out.println("CHOOSE 1 to 2 Between");
			}
			
}//end of while
		}

   }
}