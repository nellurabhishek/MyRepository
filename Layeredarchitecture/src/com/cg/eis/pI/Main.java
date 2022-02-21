package com.cg.eis.pI;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceInterface;

import Exception.NotFoundException;

public class Main 
{
	public static void main(String[] args) 
	{ 
		 EmployeeServiceInterface empService=new EmployeeServiceInterface();
		 Employee emp1=new Employee(101,"abhi",28000,null,null);
		 Employee emp2=new Employee(333,"kiran",30000,null,null);
		 Employee emp3=new Employee(567,"arun",4500,null,null);
		 Employee emp4=new Employee(122,"pramod",42000,null,null);
		 try {
			empService.addDetails(1, emp1);
			empService.addDetails(2, emp2);
			empService.addDetails(3, emp3);
			empService.addDetails(4, emp4);
		} catch (NotFoundException e) {
			
			e.printStackTrace();
		}
		  
		empService.printDetails();
		 
	}
}
