package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Trainer {
@Id
private int tid;
private String tname;
private String tech;
@OneToMany(mappedBy = "tsid",cascade = CascadeType.ALL)	// through Trainer object we can do all operation(insert,delete,update and retrieve) on students object. 
private List<Students> listOfStd;

public List<Students> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Students> listOfStd) {
	this.listOfStd = listOfStd;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}

}
