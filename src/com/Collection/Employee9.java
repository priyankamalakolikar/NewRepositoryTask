package com.Collection;
/*
 * "Write a Program in Java, You have an Employee class 
class Employee{ 
String name; 
int eid, 
int mgrid; 
} 
Every manager is also employee. So create an arraylist of 5 Emp 
and print all Employee along with their Manager name."
*/
public class Employee9 {
	String name;
	int eid;
	int mgrid;
	public Employee9(String name, int eid, int mgrid) {
		super();
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}
	@Override
	public String toString() {
		return "Employee9 [name=" + name + ", eid=" + eid + ", mgrid=" + mgrid + "]";
	}
	
}
