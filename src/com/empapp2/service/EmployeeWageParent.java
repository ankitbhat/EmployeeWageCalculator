package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageParent implements IempWageComp
{
	private String Company;
	private int wagePerHour;
	private int fullTimeHours;
	private int partTimeHours;
	private int numOfWorkingDays;
	private int maxWorkingHours;
	private int totalEmpWage;
	
	public void setCompany(String Company)
	{
		this.Company = Company;
	}	
	public void setWagePerHour(int WAGEPERHOUR)
	{
		this.wagePerHour=WAGEPERHOUR;
	}
	public void setFullTimeHours(int fth)
	{
		this.fullTimeHours=fth;
	}
	public void setPartTimeHours(int pth)
	{
		this.partTimeHours=pth;
	}
	public void setNumOfWorkingDays(int NUMOFWORKINGDAYS)
	{
		this.numOfWorkingDays = NUMOFWORKINGDAYS;
	}
	public void setMaxWorkingHours(int MAXWORKINGHOURS)
	{
		this.maxWorkingHours = MAXWORKINGHOURS;
	}
	public int isPresent()
	{
		int status = (int)Math.floor(Math.random() * 100) % 3;
		return status;
	}	
	
	@Override
	public int dailyFullWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(fullTimeHours*wagePerHour);
		return dailyEmpWage;
	}

	@Override
	public int dailyPartWage()
	{
		int dailyEmpWage =0;
		dailyEmpWage =(partTimeHours*wagePerHour);
		return dailyEmpWage;
	}
	Employee emp = new Employee();
	@Override
	public void computeEmpWage()
	{
		int temp = 0;
		int days=1,hours=0;
		while(days<= numOfWorkingDays && hours<=maxWorkingHours)
		{
			switch(isPresent())
			{
				case 1:
					System.out.println("Employee is Present and Full Time");
					System.out.println("Daily Employee Wage is :" + dailyFullWage());
					temp = dailyFullWage();
					hours+=fullTimeHours;
					break;
				case 2:
					System.out.println("Employee is Present and Part Time");
					System.out.println("Daily Employee Wage is :" + dailyPartWage());
					temp = dailyPartWage();
					hours+=partTimeHours;
					break;
				case 0:
					System.out.println("Employee is Absent");
					temp = 0;
					hours+=0;
					break;
			}
			totalEmpWage+=temp;
			System.out.println("Total Hours :" + hours);
			System.out.println("Total Days :" + days);
			System.out.println("Total Wage for Employee of Company :" + Company +" is " + totalEmpWage);
			days++;
		}
	}	
}

