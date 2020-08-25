package com.Companytask;
/*
 * Kumar said “ Woman is the wife of the grandchild of my father”
 *  What is the relationship between Kumar & Woman?*/
public class Father {
	void m1(){
  String f="father";
  System.out.println(f);
	}
}
 class Child extends Father
{
	void m1(){
		String a="kumar";
		System.out.println(a);
			}
}
 class grandChild extends Child
 {
	
	 void m1(){
		 String h=" Hus";
		 String w="Wife";
		 System.out.println("Daughter-in-law");
			}
 }