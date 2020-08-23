package com.Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test4 {
/*A hashmap contains information about students and his marks.
 *  Student object is key and marks is value. Write a method 
 *  to create 2 hashset which will have passed students of java 
 *  course and passed students of angular course. 
 *  Passing marks for java is 50 and passing marks for angular is 60.
 *   Student class is as follows. 
 *   Student { intsid , String name, String course }
*/
	public static void m1(HashMap<Student4,Integer>hm)
	{
		HashSet<Student4>hs1=new HashSet<Student4>();
		HashSet<Student4>hs2=new HashSet<Student4>();
  
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry e= (Entry) itr.next();
			Integer i=(Integer) e.getValue();
			Student4 st=(Student4) e.getKey();
			
			if(i>=50 && st.course.equals("Java"))
			{
				hs1.add(st);
			}
		    if(i>=50 && st.course.equals("Angular"))
			{
				hs2.add(st);
					
			}
		}
		System.out.println(hs1);
		System.out.println(hs2);
	}
	public static void main(String[] args) {
		HashMap<Student4,Integer>hm=new HashMap<Student4,Integer>();
		hm.put(new Student4(1,"Raju","Java"), 85);
		hm.put(new Student4(2,"Emli","Angular"), 90);
		hm.put(new Student4(3,"Chotu","Java"), 45);
		hm.put(new Student4(4,"Mithu","Angular"), 70);
		hm.put(new Student4(5,"Billu","Java"), 80);
		hm.put(new Student4(6,"Pillu","Angular"), 40);
		m1(hm);

	}
}
