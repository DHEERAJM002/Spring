package com.edu;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	
	private int sid;
	private String sname;
	private int sage;
	private List<String> addresses;
	private Set<String> courses;
	private Map<String,Integer> marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constructor is called first
	public Student(int sid, String sname, int sage, List<String> addresses, Set<String> courses,
			Map<String, Integer> marks) {
		super();
		System.out.println("Constructor called");
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.addresses = addresses;
		this.courses = courses;
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
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", addresses=" + addresses + ", courses="
//				+ courses + ", marks=" + marks + "]";
//	}
	public void display() {
		System.out.println("Id:"+sid);
		System.out.println("Name:"+sname);
		System.out.println("Age:"+sage);
		Iterator<String> address=addresses.iterator();
		System.out.print("Address: ");
		while(address.hasNext()) {
			System.out.print(address.next()+" ");
		}
		System.out.println();
		Iterator<String> course=courses.iterator();
		System.out.print("Course: ");
		while(course.hasNext()) {
			System.out.print(course.next()+" ");
		}
		System.out.println();
		System.out.print("Marks: ");
		System.out.println(marks.toString());
	}
	public void init() {
		System.out.println("Init method called");
	}
	public void destroy() {
		System.out.println("Destroy method called");
	}
}
