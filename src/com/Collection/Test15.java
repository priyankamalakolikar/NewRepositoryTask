package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Test15 {
/*Assume that there is already  arraylist of members 
 * of Society Member{memberid,Wing_flatNo,name}. 
 * Write a program which creates Map where key is Wing_FlatNo and value is List of all 
 * names of family members 

*/
	public static void main(String[] args) {

		ArrayList<Society15>al=new ArrayList<Society15>();
		al.add(new Society15(1,"A1","Sidhu") );
		al.add(new Society15(2,"B1","Priya") );
		al.add(new Society15(3,"C1","Kirti") );
		al.add(new Society15(4,"A1","Radha") );
		al.add(new Society15(5,"B1","Shital") );
		al.add(new Society15(6,"C1","Gul") );
		
		HashMap<String,ArrayList<String>>hm=new HashMap<String,ArrayList<String>>();

		/*for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				String n=al.get(i).Wing_flatNo;
				if(n.compareTo(al.get(j).Wing_flatNo)==0)
				{
				al2.add(al.get(i).name);
				}

			}
			hm.put(al.get(i).Wing_flatNo, al2);

		}*/
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Society15 str=(Society15) itr.next();
			String s=str.Wing_flatNo;
			Iterator itr2=al.iterator();
			ArrayList<String>al2=new ArrayList<String>();

			while(itr2.hasNext())
			{
				Society15 str2=(Society15) itr2.next();
           //  String s2=str2.Wing_flatNo;
                if(s.compareTo(str2.Wing_flatNo)==0)
                {
            	 al2.add(str2.name);
                }
			}
			hm.put(s, al2);
		}
		System.out.println(hm);
	}
}
