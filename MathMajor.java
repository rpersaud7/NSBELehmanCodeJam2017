package Registrar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class MathMajor extends Major{

	private boolean decminor; 
	private LinkedList<Classes> MathReq;
	private LinkedList<Classes> MathCourses;
	
	public MathMajor(boolean declared, boolean decminor) throws FileNotFoundException{
		super(declared);
		this.decminor = decminor; 
		
		try{
			Scanner r = new Scanner("MathReq.csv");
			this.MathReq = new LinkedList<Classes>();
			String studline; 
			String[] studsplit = new String[3];
			while(r.hasNext()){
				studline = r.nextLine();
				studsplit = studline.split(",");
				this.MathReq.add(studsplit[0], studsplit[1], studsplit[2]);
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
	}
	
	public MathMajor(File GenEd, File MathReq, File MathCourses, boolean declared, boolean decminor) throws FileNotFoundException {
		super(GenEd, declared);
		this.decminor = decminor; 
		
		try{
			Scanner r = new Scanner(MathReq);
			this.MathReq = new LinkedList<Classes>();
			String studline; 
			String[] studsplit = new String[3];
			while(r.hasNext()){
				studline = r.nextLine();
				studsplit = studline.split(",");
				this.MathReq.add(studsplit[0], studsplit[1], studsplit[2]);
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
		
	}
	
	public void printMathReq(){
		int a; 
		for(a = 0; a < MathReq.size()-1;a++){
			System.out.print(MathReq.get(a) + " ");
		}
		System.out.print(MathReq.get(a+1));
	}
	
	public boolean getDecMinor(){
		return decminor; 
	}
	
	public void setDecMinor(boolean decminor){
		this.decminor = decminor; 
	}
}
}
