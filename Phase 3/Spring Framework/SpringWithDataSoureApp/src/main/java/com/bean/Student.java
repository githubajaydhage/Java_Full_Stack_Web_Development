package com.bean;

import org.springframework.stereotype.Component;

@Component			// <bean class="com.Student"></bean>
public class Student {
private int sid;
private String name;
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

}
