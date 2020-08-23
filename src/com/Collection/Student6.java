package com.Collection;



public class Student6 {
	int rollno ;
	String name ;
	int marks;

	public Student6(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
@Override
	public String toString() {
		return "Student6 [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	/*@Override
	public int hashCode() {
		return marks;
	}
	@Override
	public boolean equals(Object obj) {
		Student6 s=(Student6) obj;
		
		if(this.marks==s.marks)
		{
			 hsset.add(s.marks);
			//System.out.println(s.marks);
			return true;
		}
		
		else
		{
		return false;
		}
	}*/
	
	
}
