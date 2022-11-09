package com.xworkz.Overriding;

public class BJP extends PoliticalParty{
	
	public int noOfMembers;
	public BJP(String nameOfCandidate,double meetingTime, String area,int noOfMembers)
	{
		super(nameOfCandidate,meetingTime,area);
		this.noOfMembers=noOfMembers;
	}
	
	public BJP()
	{
		super();
	}
	
	public void display()
	{
		System.out.println(this.area);
		System.out.println(this.nameOfCandidate);
		System.out.println(this.noOfMembers);
		System.out.println(this.meetingTime);
	}


}
