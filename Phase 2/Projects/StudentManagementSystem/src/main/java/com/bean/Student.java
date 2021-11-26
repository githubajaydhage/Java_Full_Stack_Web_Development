package com.bean;

public class Student {
private int sid;
private String name;
private int age;
public int getSid() {
	return sid;
}
public Student(int sid, String name, int age) {
	super();
	this.sid = sid;
	this.name = name;
	this.age = age;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
