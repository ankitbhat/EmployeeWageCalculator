package com.empapp2.service;
import com.empapp2.model.Employee;
public class EmployeeWageComp1 extends EmployeeWageParent implements IempWageComp
{
	private String Company = "Microsoft";
	private static final int WAGEPERHOUR = 20;
	private static final int FULLTIMEHOURS = 8;
	private static final int PARTTIMEHOURS = 4;
	private static final int NUMOFWORKINGDAYS = 24;
	private static final int MAXWORKINGHOURS = 120;
	
	public EmployeeWageComp1()
	
	{
		this.setCompany(Company);
		this.setWagePerHour(WAGEPERHOUR);
		this.setFullTimeHours(FULLTIMEHOURS);
		this.setPartTimeHours(PARTTIMEHOURS);
		this.setPartTimeHours(PARTTIMEHOURS);
		this.setNumOfWorkingDays(NUMOFWORKINGDAYS);
		this.setMaxWorkingHours(MAXWORKINGHOURS);
	
		
	
	}
}
