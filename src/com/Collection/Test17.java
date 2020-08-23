package com.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test17 {
	/*
	 * "An arraylist has strings ""A+2"" , ""B+12"" , ""D+4"", ""DD+5"" and 
	 * so on. Create a map which has alphabets as keys and integers as values. 
	 * If alphabet is repeated add integer to old value"
*/
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<String>al=new ArrayList<String>();
	al.add("A+2");
	al.add("B+12");
	al.add( "D+4");
	al.add("DD+5");
	System.out.println(al);
	
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	hm.put('A', 2);
	hm.put('B', 12);
	hm.put('D', 4);
	hm.put('D', 5);
	System.out.println(hm);
	Set s=hm.keySet();
	System.out.println(s);

	for(int i=0;i<4;i++)
	{
		System.out.println("enter key");
		char key=sc.next().charAt(0);
		System.out.println("Enter value");
		int value=sc.nextInt();
		if(s.contains(key))
		{
			int add=hm.get(s)+value;
			System.out.println(add);
		}
	}
	System.out.println(hm);

}
}
