package Registrar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class CompSciMajor extends Major{

	private boolean decminor; 
	private LinkedList<Classes> CompSciReq;
	private LinkedList<Classes> CompSciCourses;
	
	public CompSciMajor(boolean decminor) throws FileNotFoundException{
		super(true);
		this.decminor = decminor; 
		
		try{
			Scanner r = new Scanner("CompSciReq.csv");
			this.CompSciReq = new LinkedList<Classes>();
			String studline; 
			String[] studsplit = new String[3];
			while(r.hasNext()){
				studline = r.nextLine();
				studsplit = studline.split(",");
				this.CompSciReq.add(studsplit[0], studsplit[1], studsplit[2]);
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
	}
	
	public CompSciMajor(File GenEd, File CompSciReq, File CompSciCourses, boolean decminor) throws FileNotFoundException {
		super(GenEd, true);
		this.decminor = decminor; 
		
		try{
			Scanner r = new Scanner(CompSciReq);
			this.CompSciReq = new LinkedList<Classes>();
			String studline; 
			String[] studsplit = new String[3];
			while(r.hasNext()){
				studline = r.nextLine();
				studsplit = studline.split(",");
				this.CompSciReq.add(studsplit[0], studsplit[1], studsplit[2]);
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
		
	}
	
	public void printCompSciReq(){
		int a; 
		for(a = 0; a < CompSciReq.size()-1;a++){
			System.out.print(CompSciReq.get(a) + " ");
		}
		System.out.print(CompSciReq.get(a+1));
	}
	
	public boolean getDecMinor(){
		return decminor; 
	}
	
	public void setDecMinor(boolean decminor){
		this.decminor = decminor; 
	}
}
