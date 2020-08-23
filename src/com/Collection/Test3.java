package com.Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test3 {
/*"Given a linked list of integers , find out number of missing elements 
 * in linked list. E.g. list contains { 2 , 3, 7} missing elements are 4, 5, 6. 
 *If list contains { 3 , 13 , 7 , 2 } . missing elements are 4,5,6,8,9,10,11,12 
 *and so on. Write a logic which will work for any list."
*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(5);
		ll.add(8);
		ll.add(9);
		
		for(int i=ll.getFirst();i<=ll.getLast();i++)
		{
			if(ll.contains(i))
			{
				
			}
			else
			{
			System.out.println(i);
			}
		}
		
		
	}
}
