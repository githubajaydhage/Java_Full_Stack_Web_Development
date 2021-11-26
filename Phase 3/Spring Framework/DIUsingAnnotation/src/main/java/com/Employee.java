package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")						//	<bean class="com.Employee" id="emp"></bean>
public class Employee {		// by default id is class name using camelNaming rules ie employee 
@Value(value = "101")
private int id;
private String name;
private float salary;
@Autowired
private Address add;

public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
}

}
