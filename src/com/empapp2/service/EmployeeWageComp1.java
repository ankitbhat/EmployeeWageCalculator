package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp1 implements EmpWageComp
{
	private static final int WAGEPERHOUR = 20;
	private static final int FULLTIMEHOURS = 8;
	private static final int PARTTIMEHOURS = 4;

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
	Employee emp1 = new Employee();
	@Override
	public void empCheck()
	{
		if(emp1.isPresent() == emp1.getFullTime())
		{
			System.out.println("Employee for Company1 is Present and Full Time");
			System.out.println("Daily Employee Wage for Company1 is :" + dailyFullWage());
		}
		else if(emp1.isPresent() == emp1.getPartTime())
		{
			System.out.println("Employee for Company1 is Present and Part Time");
			System.out.println("Daily Employee Wage for Company1 is :" + dailyPartWage());
		}
		else
			System.out.println("Employee for Company1 is Absent");
	}	
}
