package Registrar;

import java.util.Scanner;

public class Student {
	private String Fname;
	private String Lname;
	private int ID;
	public String majorname;
	private Major major;
	 
	public Student(String lname, String fname, int id, String major)
	{
		this.Fname = fname;
		this.Lname = lname;
		this.ID = id;
		this.majorname = major;
		setMajor();
		
	}
	
	public Student()
	{
		
	}
	
	public String getFname(){
		return Fname;
	}
	public String getLname(){
		return Lname;
	}
	public int getID(){
		return ID;
	}
	
	public void setFname(String fname)
	{
		this.Fname = fname;
	}
	public void setLname(String lname)
	{
		this.Lname = lname;
	}
	public void setID (int id)
	{
		this.ID = id;
	}
	
	public void setMajor()
	{
		System.out.println(majorname);
		switch(majorname)
		{
		case "CS":
			//major = new ComputerScience();
			break;
		case "MATH":
			//major = new MathMajor();
			break;
		case "UNDF":
			major = new Major();
			break;
		case "MUSIC":
			break;
		default:
			System.out.println("Major Not Found!");
			break;
		}
		
	}
}
