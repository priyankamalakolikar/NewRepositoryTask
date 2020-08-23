package com.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test16 {
/*
 * Consider an ArrayList<Test>and  test has  {tid,sid,int marks[]} .
 * Create a Set<Student> Student{sid,totalmarks} 
 *  from the list and sort the set in descending order of totalmarks
*/
	public static void main(String[] args) {
		ArrayList<TestCl16>al=new ArrayList<TestCl16>();
		int[]i={10,15,20};
		int[]j={15,15,20};
		int[]k={20,15,20};

		al.add(new TestCl16(1,11,i));
		al.add(new TestCl16(2,12,j));
		al.add(new TestCl16(3,13,k));
    
		TreeSet<Student16> s=new TreeSet<Student16>(new MarkComparator() );
		s.add(new Student16(11,45));
		s.add(new Student16(12,50));
		s.add(new Student16(13,55));
		System.out.println(s);
}
}


class MarkComparator implements Comparator<Student16 >
{

	@Override
	public int compare(Student16 o1, Student16 o2) {
		// TODO Auto-generated method stub
		return o2.totalmarks-o1.totalmarks;
	}

	
	}





