package Registrar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Major implements LehmanGenEdCourses{
	private boolean declared; 
	private LinkedList<String> GenEd;
	
	public Major() throws FileNotFoundException{
		try{
			Scanner r = new Scanner("LehmanGenEd.csv");
			this.GenEd = new LinkedList<String>();
			while(r.hasNext()){
				this.GenEd.add(r.next());
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
	}
	
	public Major(File GenEd) throws FileNotFoundException { 
		try{
			Scanner r = new Scanner(GenEd);
			this.GenEd = new LinkedList<String>();
			while(r.hasNext()){
				this.GenEd.add(r.next());
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
	}
	
	public Major(boolean declared) throws FileNotFoundException {
		this.declared = declared;
		try{
			Scanner r = new Scanner("LehmanGenEd.csv");
			this.GenEd = new LinkedList<String>();
			while(r.hasNext()){
				this.GenEd.add(r.next());
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
	}
	
	public Major(File GenEd, boolean declared) throws FileNotFoundException {
		this.declared = declared;
		try{
			Scanner r = new Scanner(GenEd);
			this.GenEd = new LinkedList<String>();
			while(r.hasNext()){
				this.GenEd.add(r.next());
			}
			r.close();
		}
		catch(Exception e){
			throw e; 
		}
	}
	
	public Major(LinkedList<String> GenEd, boolean declared){
		this.declared = declared;
		for(int n = 0; n < GenEd.size(); n++){
			this.GenEd.add(GenEd.remove(n));
		}
	}
	
	public void printGenEd(){
		int z;
		for(z = 0; z < GenEd.size()-1; z++){
			System.out.print(GenEd.get(z) + ", ");
		}
		System.out.print(GenEd.get(z+1));
	}
	
}
