package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageParent implements EmpWageComp
{
	private int WAGEPERHOUR;
	private int FULLTIMEHOURS;
	private int PARTTIMEHOURS;
	int monthlyWage = 0;
	int temp = 0;
	int days=1,hours=0;
	
	public void setWagePerHour(int WAGEPERHOUR)
	{
		this.WAGEPERHOUR=WAGEPERHOUR;
	}
	public void setFullTimeHours(int fth)
	{
		this.FULLTIMEHOURS=fth;
	}
	public void setPartTimeHours(int pth)
	{
		this.PARTTIMEHOURS=pth;
	}
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
	Employee emp = new Employee();
	@Override
	public void empCheck()
	{
		while(days<21 && hours<100)
		{
			switch(emp.isPresent())
			{
				case 1:
					System.out.println("Employee is Present and Full Time");
					System.out.println("Daily Employee Wage is :" + dailyFullWage());
					temp = dailyFullWage();
					hours+=FULLTIMEHOURS;
					break;
				case 2:
					System.out.println("Employee is Present and Part Time");
					System.out.println("Daily Employee Wage is :" + dailyPartWage());
					temp = dailyPartWage();
					hours+=PARTTIMEHOURS;
					break;
				case 0:
					System.out.println("Employee is Absent");
					temp = 0;
					hours+=0;
					break;
			}
			monthlyWage+=temp;
			System.out.println("Total Hours :" + hours);
			System.out.println("Total Days :" + days);
			System.out.println("Monthly Wage for Employee is :" + monthlyWage);
			days++;
		}
	}	
}

