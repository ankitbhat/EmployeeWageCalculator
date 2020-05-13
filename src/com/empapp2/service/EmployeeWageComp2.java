package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp2 extends EmployeeWageParent implements EmpWageComp
{
	private static final int WAGEPERHOUR = 30;
	private static final int FULLTIMEHOURS = 12;
	private static final int PARTTIMEHOURS = 6;
	public EmployeeWageComp2()
	
	{
		this.setWagePerHour(WAGEPERHOUR);
		this.setFullTimeHours(FULLTIMEHOURS);
		this.setPartTimeHours(PARTTIMEHOURS);
	
	}
}

