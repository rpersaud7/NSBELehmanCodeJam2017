package Registrar;

import java.util.LinkedList;
import java.util.List;

public class Classes {

	private String name;
	private String Section;
	private int credits;
	
	List<Classes> prereq = new LinkedList<Classes>();
	
	public Classes(String section,String name,int credit)
	{
		this.Section = section;
		this.name = name;
		this.credits = credit;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getSection()
	{
		return Section;
	}
	
	public int getCredit()
	{
		return credits;
	}
	
}
