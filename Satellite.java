package com.xworkz.Overriding;

public class Satellite  {
	
	public String name;
	public double distanceFromEarth;
	public String color;
	
	public Satellite(String name,double openTiming,String color)
	{
		super();
		this.color=color;
		this.distanceFromEarth = distanceFromEarth;
		this.name=name;
	}
	
	public  void display()
	{
		System.out.println(this.name);
		System.out.println(this.distanceFromEarth);
		System.out.println(this.color);
	}
	
	public Satellite()
	{
		super();
	}

}
