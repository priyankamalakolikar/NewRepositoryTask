package com.Collection;

import java.util.ArrayList;
import java.util.Collections;




public class Test7 {
public static void main(String[] args) {
	ArrayList<Theatre7>al=new ArrayList<Theatre7>();
	al.add(new Theatre7(11,"Pvr","Pune",new Movie7(111,"ABCD",5)));
	al.add(new Theatre7(12,"TVR","Mumabai",new Movie7(112,"ABCD2",3)));
	al.add(new Theatre7(13,"SVR","Delhi",new Movie7(113,"Kesari",3)));
	al.add(new Theatre7(14,"DVR","Chennai",new Movie7(114,"ABCD4",4)));
	
	Collections.sort(al, new RatingComparator7());
	System.out.println(al);
}
}
