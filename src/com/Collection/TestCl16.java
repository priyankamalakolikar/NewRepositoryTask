package com.Collection;

import java.util.Arrays;



public class TestCl16 {
	int tid;
	int sid;
	int marks[];
	public TestCl16(int tid, int sid, int[] marks) {
		super();
		this.tid = tid;
		this.sid = sid;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "TestCl16 [tid=" + tid + ", sid=" + sid + ", marks=" + Arrays.toString(marks) + "]";
	}
	
}

