package com.xworkz.Overriding;

public class  PoliticalParty {

	public String nameOfCandidate;
	public double meetingTime;
	public String area;
	
	public PoliticalParty(String nameOfCandidate,double meetingTime,String area)
	{
		super();
		this.area=area;
		this.meetingTime=meetingTime;
		this.nameOfCandidate=nameOfCandidate;
	}
	
	public  void display()
	{
		System.out.println(this.nameOfCandidate);
		System.out.println(this.meetingTime);
		System.out.println(this.area);
	}
	
	public PoliticalParty()
	{
		super();
	}

}
