package com.coforge.Day_5;

public class Student implements Comparable<Student> {
	private int sid;
	private String sname;
	private double marks;
	public Student() {
		super();
	}
	public Student(int sid, String sname, double marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentClass [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.sid-o.sid;
	}
	
	
	
	
 
}
 
 
 