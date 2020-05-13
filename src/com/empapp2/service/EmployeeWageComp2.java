package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp2 implements EmpWageComp
{
	private static final int WAGEPERHOUR = 30;
	private static final int FULLTIMEHOURS = 12;

	@Override
	public int dailyFullWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}
	Employee emp2 = new Employee();
	@Override
	public void empCheck()
	{
		int empCheck = (int)Math.floor(Math.random() * 10) % 2;
		if(empCheck == emp2.getFullTime())
		{
			System.out.println("Employee for Company2 is Present");
			System.out.println("Daily Employee Wage for Company2 is :" + dailyFullWage());
		}
		else
			System.out.println("Employee for Company2 is Absent");
	}	
}

