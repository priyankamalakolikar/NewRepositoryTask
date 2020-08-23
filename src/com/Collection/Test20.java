package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Test20 {
/*
 * "13. Consider List of T20 Players.
Player (playerid,Name,Country,team)
e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
Then find out which team has maximum Australian players."
*/
	public static void main(String[] args) {
		ArrayList<Player20>al=new ArrayList<Player20>();

		al.add(new Player20(1,"MsDhoni","India","CSK") );
		al.add(new Player20(2,"ShenWatsan","Australia","CSK") );
		al.add(new Player20(3,"Pittersan","Southafrica","RCB") );
		al.add(new Player20(4,"Shenwarn","Australia","CSK") );
		al.add(new Player20(5,"RohitShrama","India","MI") );
		al.add(new Player20(6,"Ravindrajadeja","India","CSK") );
		al.add(new Player20(7,"Shenwarn","Australia","CSK") );
		al.add(new Player20(8,"DevidWarner","Australia","MI") );
		al.add(new Player20(9,"Steve Smith","Australia","MI") );
		al.add(new Player20(10,"AronFinch","Australia","MI") );
		Iterator itr=al.iterator();
		int count=0;
		String s = null;
		while(itr.hasNext())
		{
			Player20 p=(Player20) itr.next();
			if(p.Country.equals("Australia"))
			{
				count++;
				s=p.team;
			}

		}
		System.out.println(s+" "+count);


	}
}
