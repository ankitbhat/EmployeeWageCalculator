package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp2 extends EmployeeWageParent implements IempWageComp
{
	private String Company = "Google";	
	private static final int WAGEPERHOUR = 30;
	private static final int FULLTIMEHOURS = 12;
	private static final int PARTTIMEHOURS = 6;
	private static final int NUMOFWORKINGDAYS = 22;
	private static final int MAXWORKINGHOURS = 100;
	public EmployeeWageComp2()
	
	{
		this.setCompany(Company);
		this.setWagePerHour(WAGEPERHOUR);
		this.setFullTimeHours(FULLTIMEHOURS);
		this.setPartTimeHours(PARTTIMEHOURS);
		this.setNumOfWorkingDays(NUMOFWORKINGDAYS);
		this.setMaxWorkingHours(MAXWORKINGHOURS);
	
	}
}

