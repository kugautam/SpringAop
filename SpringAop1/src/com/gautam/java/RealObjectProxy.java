package com.gautam.java;

public class RealObjectProxy extends RealObjectImpl
{
	
	@Override
	public void something()
	{
		System.out.println("adding additional security");
		super.something();
	}

}