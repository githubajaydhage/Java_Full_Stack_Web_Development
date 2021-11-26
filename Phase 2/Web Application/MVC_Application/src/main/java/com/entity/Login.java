package com.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "login")
public class Login {
@Id
private String email;
private String pass;
private String typeofuser;

public String getTypeofuser() {
	return typeofuser;
}
public void setTypeofuser(String typeofuser) {
	this.typeofuser = typeofuser;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
