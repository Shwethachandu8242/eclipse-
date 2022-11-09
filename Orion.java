package com.xworkz.Overriding;

public class Orion extends ShoppingMall {
	
	public int noOfStores;
	public Orion(String name,double openTiming, String area,int noOfStores)
	{
		super(name,openTiming,area);
		this.noOfStores=noOfStores;
	}
	
	public Orion()
	{
		super();
	}
	
	public void display()
	{
		System.out.println(this.area);
		System.out.println(this.name);
		System.out.println(this.noOfStores);
		System.out.println(this.openTiming);
	}

}
