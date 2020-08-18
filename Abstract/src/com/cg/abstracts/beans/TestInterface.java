package com.cg.abstracts.beans;

public class TestInterface implements InterfaceEx,Interface2 {

	
	public void show()
	{
		System.out.println("this is displayed from IntrfaceEx");
	}
	
	public void display()
	{
		System.out.println("this is displayed from Interface2");
	}
}
