package com.Companytask;

public class Test2 {
/*A can finish a work in 60 days, B in 9 days and C in 10 days.
 *  B and C start the work but are forced to leave after 3 days.
 *  The remaining work was done by A in: ?*/
	 public static void work(int a,int b,int c)
	 {
		double totalwork=1.0;
		double wA=1.0/a;
		double wB=1.0/b;
		double wC=1.0/c;
		//work done by B & C
		double workBC=3*(wC+wB);
		//Remaining work  A to do 
		double Rm=totalwork-workBC;
		double workdonebyA=Rm*a;
		System.out.println(workdonebyA);
	 }
	public static void main(String[] args) {
	
		work(60,9,10);
	}
}
