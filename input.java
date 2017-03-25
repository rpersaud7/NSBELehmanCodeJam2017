package codejam2017;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class input {
	

	public static void main(String[] args) {
		Scanner employ = new Scanner(System.in);
		Scanner selection = new Scanner(System.in);
		
		System.out.println("Enter Employ ID:");
		int x = employ.nextInt();
		
		LoadStudents loader = new LoadStudents();
		
		
		Student default1 = new Student("John", "Doe", "13136098", "Computer Science");
		
		boolean name = true;
		
		while(name){
			System.out.println(default1.getFname(), default1.getLname(), default1.getID(), default1.getMajor());
				
			System.out.println("1: Choose Classes for next semester");
			System.out.println("2: Course History");
			System.out.println("3: Contact Advisor");
			System.out.println("4: Schedule an Appointment");
			
			System.out.println("Make a selection:");
			int y = selection.nextInt(); 
			
			System.out.println("Would you like to continue? Y / N ");
			String resp = employ.nextLine();
			if(resp.equalsIgnoreCase("n")){
				name = false; 
			}
			
		}
		
		
		// TODO Auto-generated constructor stub
	}

} 
