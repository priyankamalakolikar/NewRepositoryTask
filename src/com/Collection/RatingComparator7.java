package com.Collection;

import java.util.Comparator;



public class RatingComparator7 implements Comparator<Theatre7>{

	@Override
	public int compare(Theatre7 o1, Theatre7 o2) {
		// TODO Auto-generated method stub
		int i=o1.m.Rating-o2.m.Rating;
		if(i==0)
		{
		return o1.Theatrename.compareTo(o2.Theatrename);
		}
		else
		{
			return o1.m.Rating-o2.m.Rating;
		}
		
	}

}
