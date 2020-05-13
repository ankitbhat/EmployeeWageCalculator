package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp1 extends EmployeeWageParent implements EmpWageComp
{
	private static final int WAGEPERHOUR = 20;
	private static final int FULLTIMEHOURS = 8;
	private static final int PARTTIMEHOURS = 4;
	public EmployeeWageComp1()
	
	{
		this.setWagePerHour(WAGEPERHOUR);
		this.setFullTimeHours(FULLTIMEHOURS);
		this.setPartTimeHours(PARTTIMEHOURS);
	
	}
}
