package com.empapp2.model;
public class Employee
{
	private static final int FULLTIME = 1;
	private static final int PARTTIME = 2;
	
	public int getFullTime()
	{
		return this.FULLTIME;
	}
	public int getPartTime()
	{
		return this.PARTTIME;
	}
	public int isPresent()
	{
		int temp = (int)Math.floor(Math.random() * 100) % 3;
		return temp;
	}
					
}
