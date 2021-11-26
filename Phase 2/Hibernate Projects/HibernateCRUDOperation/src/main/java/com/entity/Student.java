package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity					// class level annotaiton 
@Table(name="student")
public class Student {
@Id											// the column which contains pk 
@Column(name="sid")
private int sid;
@Column(name="name")
private String name;
@Column(name="age")
private int age;
public int getSid() {
	return sid;
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
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", age=" + age + "]";
}


}
