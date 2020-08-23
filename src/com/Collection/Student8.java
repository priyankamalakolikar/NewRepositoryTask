package com.Collection;

import java.util.List;

public class Student8 {
	int sid;
	String sname;
	List<String> hobby;
	public Student8(int sid, String sname, List<String> hobby) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student8 [sid=" + sid + ", sname=" + sname + ", hobby=" + hobby + "]";
	}
	
}
