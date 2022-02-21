package com.cg.eis.exception;
import java.util.*;

class Exercise3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary :");
		double sal = sc.nextDouble();
		
		try
		{
			validateSalary(sal);
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}
	
	static void validateSalary(double sal) throws EmployeeException
	{
		if(sal < 3000)
		{
			throw new EmployeeException("salary cannot be lass that 3000");
		}
		else
		{
			System.out.println("Salary is "+sal);
		}
	}
}

class EmployeeException extends Exception
{
	EmployeeException(String errormsg)
	{
		super(errormsg);
	}
}