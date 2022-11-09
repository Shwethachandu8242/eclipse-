package com.xworkz.Overriding;

public class ShoppingMall 
{
	public String name;
	public double openTiming;
	public String area;
	
	public ShoppingMall(String name,double openTiming,String area)
	{
		super();
		this.area=area;
		this.openTiming=openTiming;
		this.name=name;
	}
	
	public  void display()
	{
		System.out.println(this.name);
		System.out.println(this.openTiming);
		System.out.println(this.area);
	}
	
	public ShoppingMall()
	{
		super();
	}
}
