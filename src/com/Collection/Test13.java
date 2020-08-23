package com.Collection;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test13 {
	/*
	 * Create two Set of students objects where insertion 
	 * order in maintained. Now accept Studentid from user and
	 *  check whether in both sets have student with given 
	 *  id at same position
*/
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	LinkedHashSet<Student13>s1=new 	LinkedHashSet<Student13>();
	LinkedHashSet<Student13>s2=new 	LinkedHashSet<Student13>();
	for(int i=0;i<2;i++)
	{
		System.out.println("enter sid");
		int sid=sc.nextInt();
		System.out.println("enter sname");
        String sname=sc.next();
        s1.add(new Student13(sid,sname));
	}
	System.out.println(s1);
	for(int i=0;i<2;i++)
	{
		System.out.println("enter sid");
		int sid=sc.nextInt();
		System.out.println("enter sname");
        String sname=sc.next();
        s2.add(new Student13(sid,sname));
	}
System.out.println(s2);
}
}
