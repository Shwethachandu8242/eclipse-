package com.xworkz.Overriding;

public class Director  {
	
	public String name;
	public int age;
	public String filmname;
	
	public Director(String name,int age,String filmname)
	{
		super();
		this.filmname=filmname;
		this.age=age;
		this.name=name;
	}
	
	public  void display()
	{
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.filmname);
	}
	
	public Director()
	{
		super();
	}


}
