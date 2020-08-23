package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test5 {
/* "Assume that there is already aarraylist of Customer objects.
 *  Customer { intcid , String name ,int[] items }. 
 *  Write a program which creates hashset of customer objects. If there are
    multiple customer object for same customer in arraylist ,
    then items should be added to previous customer’s items.                                                                                                                Once set is created sort that set based on no. of items purchased by that customer.Customer with maximum items should be first."
*/
	
	public static void main(String[] args) {
        HashSet<Customer5>hs=new HashSet<Customer5>();

		ArrayList<Customer5>al=new ArrayList<Customer5>();
		
		al.add(new Customer5(1,"AA",new int[4]));
		al.add(new Customer5(2,"BB",new int[5]));
		al.add(new Customer5(3,"CC",new int[6]));
		al.add(new Customer5(1,"BB",new int[3]));
        al.add(new Customer5(2,"BB",new int[2]));
        int[] b = null;
        for(int i=0;i<al.size();i++)
        {
        	for(int j=i+1;j<al.size();j++)
        	{
                if(al.get(i).cid==al.get(j).cid)
                {
                	//System.out.println(Arrays.toString(al.get(i).items));
                	/*	System.out.println(al.get(i).items[i]+al.get(j).items[i]);
                	*/
         //  System.out.println(al.get(i).items.length+al.get(j).items.length); 
        	//hs.add(new Customer5(al.get(i).cid,al.get(i).name,al.get(i).items));

                }
                
        	}
        	hs.add(new Customer5(al.get(i).cid,al.get(i).name,al.get(i).items));
        	
        }
        
     for(Customer5 c:hs)
     {
    	 System.out.println(c);
     }
	}
}
