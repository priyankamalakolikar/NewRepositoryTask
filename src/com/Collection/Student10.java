package com.Collection;

import java.util.List;

public class Student10 {
int sid;
String snmae;
List<String>course;
public Student10(int sid, String snmae, List<String> course) {
	super();
	this.sid = sid;
	this.snmae = snmae;
	this.course = course;
}
@Override
public String toString() {
	return "Student10 [sid=" + sid + ", snmae=" + snmae + ", course=" + course + "]";
}


}
