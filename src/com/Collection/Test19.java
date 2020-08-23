package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test19 {
/*
 * "There is a HashSet which has student objects. 
 * Create two arraylists from this hashset. In one arraylist called ‘placedStudents’ insert all students who have
been placed and in another arraylist ‘unplacedStudents’
Student class--Fields
studid, Name, Qualification, yearOfpassing, placed(true/false)"
*/
	public static void main(String[] args) {
		HashSet<Student19>hs=new HashSet<Student19>();
		hs.add(new Student19(11,"Arti","BE",2017,true) );
		hs.add(new Student19(12,"Shruti","BE",2018,false) );
		hs.add(new Student19(13,"Prti","BE",2019,true) );
		hs.add(new Student19(14,"Sidhi","BE",2020,false) );
		ArrayList<String>al=new ArrayList<String>();
		ArrayList<String>al2=new ArrayList<String>();
		Iterator itr=hs.iterator();
		
		while(itr.hasNext())
		{
			
			Student19 s=(Student19) itr.next();
			if(s.plaed==true)
			{
				al.add(s.name);
			}
			else{
				al2.add(s.name);
			}

		}
System.out.println("Placed: "+al);
System.out.println("UnPlaced: "+al2);
	}
}
