package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp1 implements EmpWageComp
{
	private static final int WAGEPERHOUR = 20;
	private static final int FULLTIMEHOURS = 8;

	@Override
	public int dailyFullWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(FULLTIMEHOURS*WAGEPERHOUR);
		return dailyEmpWage;
	}
	Employee emp1 = new Employee();
	@Override
	public void empCheck()
	{
		int empCheck = (int)Math.floor(Math.random() * 10) % 2;
		if(empCheck == emp1.getFullTime())
		{
			System.out.println("Employee for Company1 is Present");
			System.out.println("Daily Employee Wage for Company1 is :" + dailyFullWage());
		}
		else
			System.out.println("Employee for Company1 is Absent");
	}	
}
