package com.empapp2.test;
import com.empapp2.model.*;
import com.empapp2.service.*;
public class EmployeeTest
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		IempWageComp obj = new EmployeeWageBuilder();
		obj.addEmpWageCompany("Microsoft", 20, 8, 4, 22, 100);
		obj.addEmpWageCompany("Google", 30, 12, 6, 24, 120);
		obj.computeEmpWage();
		System.out.println("Total wage for Company Microsoft is :" + obj.getTotalWage("Microsoft"));
	}
}
