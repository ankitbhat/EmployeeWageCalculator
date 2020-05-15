package com.empapp2.model;
import java.util.*;
public class EmpWageCompany
{
	public final String company;
	public final int wagePerHour;
	public final int fullTimeHours;
	public final int partTimeHours;
	public final int numOfWorkingDays;
	public final int maxWorkingHours;
	public int totalEmpWage;
	public List<Integer> dailyWage = new ArrayList<>();
	
	public EmpWageCompany(String company, int wagePerHour,int fullTimeHours, int partTimeHours, int numOfWorkingDays, int maxWorkingHours)
	
	{
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.fullTimeHours = fullTimeHours;
		this.partTimeHours = partTimeHours;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}
	public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage = totalEmpWage;
	}
	public void getDailyWage()
	{
		System.out.println("Daily Wages :" + dailyWage);
	}

	@Override
	public String toString()
	{
		return "Total Employee Wage for Company :" + company +" is : " +totalEmpWage;
	}
}
