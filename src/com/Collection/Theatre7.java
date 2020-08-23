package com.Collection;

public class Theatre7 {
	int Theatreid;
	String Theatrename;
	String location;
	Movie7 m;
	public Theatre7(int theatreid, String theatrename, String location, Movie7 m) {
		super();
		Theatreid = theatreid;
		Theatrename = theatrename;
		this.location = location;
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theatre7 [Theatreid=" + Theatreid + ", Theatrename=" + Theatrename + ", location=" + location + ", m="
				+ m + "]";
	}
	
}
