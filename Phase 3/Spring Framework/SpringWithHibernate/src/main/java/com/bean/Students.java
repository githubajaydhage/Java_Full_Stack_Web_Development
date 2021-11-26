package com.bean;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Entity
@Component
@Scope("prototype")		
public class Students {
@Id
private int sid;								// 104,Leeta,34,0(trainerId) or (make tsid is type Integer) 
private String sname;
private int age;
private int tsid;						// 
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getTsid() {
	return tsid;
}
public void setTsid(int tsid) {
	this.tsid = tsid;
}

}
