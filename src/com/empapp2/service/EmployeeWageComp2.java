package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp2 implements EmpWageComp
{
	Employee emp2 = new Employee();
	public void empCheck()
	{
	int empCheck = (int)Math.floor(Math.random() * 10) % 2;
		if(empCheck == emp2.getFullTime())
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}	
}

