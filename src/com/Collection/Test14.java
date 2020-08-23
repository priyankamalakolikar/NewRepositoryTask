package com.Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Test14 {
/*
 * "Given two LinkedList, we need to combine two LinkedList  in such a way that the combined aList has alternate elements of both. If one list has extra element, then these elements are appended at the end of the combined list.

Input : list1 = {1, 2, 3, 4, 5, 6}
List2 = {11, 22, 33, 44}
List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}
"
*/
	public static void main(String[] args) {
		LinkedList<Integer>ld=new LinkedList<Integer>();
		ld.add(11);
		ld.add(22);
		ld.add(33);
		ld.add(44);
		LinkedList<Integer>ld1=new LinkedList<Integer>();
		ld1.add(1);
		ld1.add(2);
		ld1.add(3);
		ld1.add(4);
		ld1.add(5);
		LinkedList<Integer>ld3=new LinkedList<Integer>();
ld3.addAll(ld);
System.out.println(ld3);

}
}