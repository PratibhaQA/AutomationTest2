package com.java;

public class OverLoading {

	public void m1(int x)
	{
		
	  System.out.println(x);

	}
	public void m1(float x)
	{
		System.out.println(x);
	}
	public void m1(String x)
	{
	  System.out.println(x);	
	}

	public static void main(String args[])
	{
		OverLoading obj = new OverLoading();
		obj.m1(100);
		obj.m1(23.90f);
		obj.m1("Pratibha");
		
	}
}

//same method name ,same parameters but different parameter types is called as methid overloading.