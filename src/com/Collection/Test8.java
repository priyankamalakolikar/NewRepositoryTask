package com.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test8 {
/*"Consider an array of Student 
Student (int sid, String sname, List<String> hobby)
From this list create a Map<String,List<Student>> where key is hobby name and list of
student objects having same hobby. Also find out most common hobby among students"
*/
	public static void main(String[] args) {
		Student8[] st=new Student8[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter sid " );
			int sid=sc.nextInt();
			System.out.println("Enter Sname");
			String sname=sc.next();
			List<String>hobby=new ArrayList<String>();
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter hobby");
				hobby.add(sc.next());
			}
			st[i]=new Student8(sid,sname,hobby);
		}
	//	System.out.println(st);//it will print hashcodeso iterate through for loop
		
		for(int i=0;i<st.length;i++)
		{
			//give obj type as ref type
			Student8 st2=st[i];
			System.out.println("Sid = "+st2.sid+" "+"Sname = "+st2.sname);
			/*for(int j=0;j<st2.hobby.size();j++)
			{
				System.out.println("Hobbies = "+st2.hobby.get(j));
			}*/
			System.out.println(st2.hobby);
		}
		HashMap<String,List<Student8>> hm=new HashMap<String,List<Student8>>();
	    for(int i=0;i<st.length;i++)
	    {
	    	Student8 st2=st[i];
	    	
	    	for(int j=0;j<st2.hobby.size();j++)
	    	{
	    		String newhobby=st2.hobby.get(j);
	    		ArrayList<Student8> al=new ArrayList();
	    		for(int k=0;k<st[i].hobby.size();k++)
	    		{
	    			Student8 str=st[i];
	    			if(str.hobby.contains(newhobby))
	    			{
	    				al.add(str);
	    			}
	    		}
    			hm.put(newhobby, al);

	    	}
	    }
	    for(Student8 ayr:st)
	    {
	System.out.println(ayr);
	    }
	    
	    Set tt=hm.entrySet();
	    Iterator itr=tt.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry m=(Entry) itr.next();
	    	System.out.println(m.getKey());
	    	System.out.println(m.getValue());
	    }
	}
}
