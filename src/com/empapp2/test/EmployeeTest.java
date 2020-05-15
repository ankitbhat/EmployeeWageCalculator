package com.empapp2.test;
import com.empapp2.model.Employee;
import com.empapp2.service.*;
public class EmployeeTest
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		IempWageComp obj1 = new EmployeeWageComp1();
		IempWageComp obj2 = new EmployeeWageComp2();	
		obj1.computeEmpWage();
		obj2.computeEmpWage();
	}
}
