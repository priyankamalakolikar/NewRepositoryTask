package com.Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Test2 {
/*"Given a Linkedhashmap<string, integer> , find out if given list of keys (Strings )appear in
same order in hashmap. E.g. Linkedhashmap has { “pqr” , 12 } { “rst” , 43 } { “abc” , 4 } {
“mno” ,2}
Given list is (“rst”) (“abc”) so it appears in same order. Output should be “true”
If given list is (“abc” ) (“pqr” ) then output should be “false”"
*/
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer>lm=new LinkedHashMap(   );
		lm.put("pqr", 12);
		lm.put("rst", 43);
		lm.put("abc", 4);
		String ab;
		
		System.out.println("************");
		LinkedList<String>ll=new LinkedList<String>();
		
		/*ll.add("pqr");
		ll.add("rst");*/ //TRUE
		
		ll.add("abc");
		ll.add("rst"); //FALSE
		Collections.sort(ll);
		boolean f=true;
		for(String str:ll)
		{
			Set s = lm.entrySet();
			Iterator itr = s.iterator();
			while (itr.hasNext()) {
				Map.Entry e = (Entry) itr.next();
				ab = (String) e.getKey();
				//System.out.println(ab);
				if(str.equals(ab))
				{
					f=true;
					break;
				}
				else
				{
					f=false;
					itr.remove();
				}
			}
			

		}
		System.out.println(f);
		
		/*if(ll.get(i)==ab)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}*/

	}
}
