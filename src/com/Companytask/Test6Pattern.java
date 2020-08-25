package com.Companytask;

public class Test6Pattern {
	public static void main(String[] args) {
		System.out.println("pgm std");
		int lines=3;
		int starcount=1;
		int spacecount=lines-1;
		for(int i=1;i<=lines;i++)
		{
			for(int j=1;j<=spacecount;j++)
		{
			System.out.print("_");
		}
			
			for(int k=1;k<=starcount;k++)
			{
				System.out.print("*");
			}
			
			
		for(int j=1;j<=spacecount;j++)
			{
				System.out.print("_");
			}
		
			System.out.println();
			
			starcount=starcount+2;
			spacecount--;
		}
		System.out.println("pgm ended");
	}
}
