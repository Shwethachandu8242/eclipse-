package com.xworkz.Overriding;

public class Balu extends Director {

	
	public int noOfHitMovies;
	public Balu(String name,int age, String filmname,int noOfHitMovies)
	{
		super(name,age,filmname);
		this.noOfHitMovies=noOfHitMovies;
	}
	
	public Balu()
	{
		super();
	}
	
	public void display()
	{
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.filmname);
		System.out.println(this.noOfHitMovies);
	}
}
