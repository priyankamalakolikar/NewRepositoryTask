package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test12 {
/*
 * Create a Map<String,String> where key is adharno  and 
 * value is voted casted to which party(eg. BJP,ShivSena,NCP,Congress,Other) .
 * From this create new map such that KEY is party name and value is count of votes casted 
*/
	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("1213", "Shivsena");
		hm.put("1345", "BJP");
		hm.put("18345", "NCP");
		hm.put("1254", "Congress");
		hm.put("1546", "others");
		hm.put("1347", "BJP");
		hm.put("1348", "BJP");
		hm.put("1349", "BJP");
		hm.put("13429", "BJP");
		hm.put("1258", "Congress");
		hm.put("1259", "Congress");
		hm.put("12188", "Shivsena");
		hm.put("12199", "Shivsena");
		hm.put("12100", "Shivsena");

		int Shiv=0;
		int BJ=0;
		int Nc=0;
		int Cong=0;
		int otr=0;
		HashMap<String,Integer>Result=new HashMap<String,Integer>();

		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Entry) itr.next();
			String str=(String) m.getValue();
			if(str.contains("BJP"))
			{
				BJ++;
				Result.put(str, BJ);
			}
			else if(str.contains("Shivsena"))
			{
				Shiv++;
				Result.put(str, Shiv);

			}
			else if(str.contains("NCP"))
			{
				Nc++;
				Result.put(str, Nc);

			}else if(str.contains("Congress"))
			{
				Cong++;
				Result.put(str, Cong);

			}else if(str.contains("others"))
			{
				otr++;
				Result.put(str, otr);

			}
		}
System.out.println(Result);

	}
}
