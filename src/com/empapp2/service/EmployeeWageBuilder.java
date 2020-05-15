package com.empapp2.service;
import com.empapp2.model.*;
public class EmployeeWageBuilder implements IempWageComp
{
	private int numOfCompanies = 0;
	private EmpWageCompany[] companyArray;
	public EmployeeWageBuilder()
	{
		companyArray = new EmpWageCompany[5];
	}
	public void addEmpWageCompany(String company, int wagePerHour,int fullTimeHours, int partTimeHours, int numOfWorkingDays, int maxWorkingHours)
	{
		companyArray[numOfCompanies] = new EmpWageCompany(company, wagePerHour, fullTimeHours, partTimeHours, numOfWorkingDays, maxWorkingHours);
		numOfCompanies++;
	}
	public void computeEmpWage()
	{
		for(int i=0; i< numOfCompanies; i++)
		{
			companyArray[i].setTotalEmpWage(this.computeEmpWage(companyArray[i]));
			System.out.println(companyArray[i]);
		}
	}
	public int isPresent()
	{
		int status = (int)Math.floor(Math.random() * 100) % 3;
		return status;
	}

	@Override
	public int dailyFullWage(EmpWageCompany obj)
	{
		int dailyEmpWage =0;
		dailyEmpWage =(obj.fullTimeHours*obj.wagePerHour);
		return dailyEmpWage;
	}

	@Override
	public int dailyPartWage(EmpWageCompany obj)
	{
		int dailyEmpWage =0;
		dailyEmpWage =(obj.partTimeHours*obj.wagePerHour);
		return dailyEmpWage;
	}
	public int computeEmpWage(EmpWageCompany comp)
	{
		int temp = 0;
		int days=1,hours=0;
		while(days<=comp.numOfWorkingDays && hours<=comp.maxWorkingHours)
		{
			switch(isPresent())
			{
				case 1:
					System.out.println("Employee is Present and Full Time");
					temp = dailyFullWage(comp);
					System.out.println("Daily Employee Wage is :" + temp);
					hours+=comp.fullTimeHours;
					break;
				case 2:
					System.out.println("Employee is Present and Part Time");
					temp = dailyPartWage(comp);
					System.out.println("Daily Employee Wage is :" + temp);
					hours+=comp.partTimeHours;
					break;
				case 0:
					System.out.println("Employee is Absent");
					temp = 0;
					hours+=0;
					break;
			}
			comp.totalEmpWage+=temp;
			System.out.println("Total Hours :" + hours);
			System.out.println("Total Days :" + days);
			System.out.println("Cumulative Wage for Employee of Company :" + comp.company +" is " + comp.totalEmpWage);
			days++;
		}
		if(hours>comp.maxWorkingHours)
			comp.totalEmpWage -= (hours-comp.maxWorkingHours)*comp.wagePerHour;
		return comp.totalEmpWage;
	}
}

