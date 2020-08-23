package com.Collection;

import java.util.ArrayList;

public class Test18 {
/*"An arraylist has strings ""A+2"" , ""B+12"" , ""D+4"", ""DD+5"" and so on. Create a
method which accepts a String eg D in input and will return
associated number value eg in this case 4 by looping the arraylist and
finding matching pattern"
*/
	public static void get(ArrayList<String> al,String c)
	{
		ArrayList<String> fl=new ArrayList<String>() ;
		ArrayList<Integer> sl=new ArrayList<Integer>() ;

		for(int i=0;i<al.size();i++)
		{
		String s=al.get(i);
		String[] s1=s.split("\\+");
		if(s1[0].equals(c))
		{
			System.out.println(s1[1]);
			String b=s1[1];
			int p=Integer.parseInt(s1[1])  ;
		    sl.add(p);
		    fl.add(s1[0]);
		}
		}
		System.out.println(fl);
		System.out.println(sl);
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("A+4");
		al.add("B+2");
		al.add("D+6");
		al.add("DD+22");
		
		get(al,"DD");
	}
}
