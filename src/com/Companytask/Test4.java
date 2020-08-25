package com.Companytask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Test4 {
/*
 * A Raj walks 7 km towards East and then he turns to
 *  south and walks 5 km. Again he turns to the East and walks 5 km,
 *   after this he turns to North and walks 10 km.
 *  Now how far is he from his starting point*/
	
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter RAj walks from");
			int d=sc.nextInt();
			
		}*/
		int East=7;
		int south=5;
		int East2=5;
		int North=10;
		int dist=(East+East2)*(East+East2)+(North/2)*(North/2);
		int finaldistance=(int) Math.sqrt(dist);
		System.out.println("Distance from starting point: "+finaldistance);
		
	
	}
}
