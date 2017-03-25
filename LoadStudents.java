package Registrar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LoadStudents{

	String filename;
	
	public LoadStudents(String newfile)
	{
		this.filename = newfile;
	}
	public LoadStudents()
	{
		filename = "src\\Registrar\\Students.csv";
	}
	public List<Student>Load() throws FileNotFoundException
	{
		List<Student> studentList = new LinkedList<Student>();
		
		try{
			
			Scanner in = new Scanner(new File(filename));
			String studline;
			String[] studsplit = new String[4];
			
			while(in.hasNextLine() != false)
			{
				studline = in.nextLine();
				System.out.println(studline);
				studsplit = studline.split(",");
				Student student = new Student(studsplit[0],studsplit[1],Integer.parseInt(studsplit[2]),studsplit[3]);
				studentList.add(student);
			}
			in.close();
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
			
		}
		return studentList;
	}
}
