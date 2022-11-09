package com.xworkz.Overriding;

public class Moon extends Satellite {

	public boolean visibility;
	public Moon(String name,double distanceFromEarth, String color, boolean visibility)
	{
		super(name,distanceFromEarth,color);
		this.visibility=visibility;
	}
	
	public Moon()
	{
		super();
	}
	
	public void display()
	{
		System.out.println(this.color);
		System.out.println(this.name);
		System.out.println(this.distanceFromEarth);
		System.out.println(this.visibility);
	}
}
