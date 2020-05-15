package com.empapp2.service;
import com.empapp2.model.*;
public interface IempWageComp
{
	public void addEmpWageCompany(String company, int wagePerHour,int fullTimeHours, int partTimeHours, int numOfWorkingDays, int maxWorkingHours);
	public void computeEmpWage();
	public int dailyFullWage(EmpWageCompany emp);
	public int dailyPartWage(EmpWageCompany emp);
}

