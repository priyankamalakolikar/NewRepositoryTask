package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test6 {
	/*
	 * "WAP where in Set<Student>containing { introllno , String name , intmarks
	 * } are changed to Map where key will be marks and value will be List of
	 * RollNos where all those students who have same marks are together."
	 */
	public static void main(String[] args) {
		// ArrayList<Integer> al=new ArrayList<Integer>();
		HashSet<Student6> hs = new HashSet<Student6>();
		hs.add(new Student6(1, "AA", 90));
		hs.add(new Student6(2, "BB", 60));
		hs.add(new Student6(3, "CC", 70));
		hs.add(new Student6(4, "DD", 90));
		hs.add(new Student6(5, "EE", 90));
		hs.add(new Student6(6, "rr", 80));
		hs.add(new Student6(7, "yy", 90));
		hs.add(new Student6(8, "zz", 70));
		hs.add(new Student6(9, "gg", 100));
		hs.add(new Student6(10, "yyy", 100));

		HashMap<Integer, ArrayList<Integer>> HM = new HashMap<Integer, ArrayList<Integer>>();

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			Student6 s = (Student6) itr.next();
			Integer marks = s.marks;
			/*
			 * if(s.marks==hs.iterator().next().marks) { al.add(s.rollno);
			 * HM.put(s.marks, al);
			 * 
			 * }
			 */
			Iterator itr1 = hs.iterator();
			ArrayList<Integer> al = new ArrayList<Integer>();
			while (itr1.hasNext()) {
				Student6 s1 = (Student6) itr1.next();
				if (marks == s1.marks) {
					al.add(s1.rollno);
				}

			}
			HM.put(marks, al);
		}

		System.out.println(HM);
	}
}
