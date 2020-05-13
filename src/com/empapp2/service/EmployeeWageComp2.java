package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp2 implements EmpWageComp
{
	private static final int WAGEPERHOUR = 30;
	private static final int FULLTIMEHOURS = 12;
	private static final int PARTTIMEHOURS = 6;

	@Override
	public int dailyFullWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}

	@Override
	public int dailyPartWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(PARTTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}
	Employee emp2 = new Employee();
	@Override
	public void empCheck()
	{
		if(emp2.isPresent() == emp2.getFullTime())
		{
			System.out.println("Employee for Company2 is Present and Full Time");
			System.out.println("Daily Employee Wage for Company2 is :" + dailyFullWage());
		}
		else if(emp2.isPresent() == emp2.getPartTime())
		{
			System.out.println("Employee for Company2 is Present and Part Time");
			System.out.println("Daily Employee Wage for Company2 is :" + dailyPartWage());
		}
		else
			System.out.println("Employee for Company2 is Absent");
	}	
}

