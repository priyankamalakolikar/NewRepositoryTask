package com.Collection;

import java.util.Arrays;

public class Customer5 implements Comparable<Customer5>{
	int cid ;
	String name ;
	int[] items ;
	public Customer5(int cid, String name, int[] items) {
		super();
		this.cid = cid;
		this.name = name;
		this.items = items;
	}
	@Override
	public String toString() {
		return "Customer5 [cid=" + cid + ", name=" + name + ", items=" + Arrays.toString(items) + "]";
	}
	@Override
	public int compareTo(Customer5 o) {
		// TODO Auto-generated method stub
		int i=this.cid-o.cid;
		if(i==0)
		{
		return this.items.length+o.items.length;
		}
		else
		{
			return o.items.length;
		}
	}
	
}
