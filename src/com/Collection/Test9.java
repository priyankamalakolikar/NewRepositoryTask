package com.Collection;

import java.util.ArrayList;

public class Test9 {
public static void main(String[] args) {
	ArrayList<Employee9>al=new ArrayList<Employee9>();
	al.add(new Employee9("Sarita",101,105));
	al.add(new Employee9("Rutika",102,103));
	al.add(new Employee9("Samayra",103,104));
	al.add(new Employee9("Radhika",104,102));
	al.add(new Employee9("Priyanka",105,105));
	for(int i=0;i<al.size();i++)
	{
		for(int j=0;j<al.size();j++)
		{
		  if(al.get(i).eid==al.get(j).mgrid)
		  {
			System.out.println("Empname: "+al.get(j).name+" "+"ManagerName: "+al.get(i).name);
		  }
		}
	}

}
}
