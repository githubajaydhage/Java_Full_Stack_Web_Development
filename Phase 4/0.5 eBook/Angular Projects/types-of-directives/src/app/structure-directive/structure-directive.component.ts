import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';

@Component({
  selector: 'app-structure-directive',
  templateUrl: './structure-directive.component.html',
  styleUrls: ['./structure-directive.component.css']
})
export class StructureDirectiveComponent implements OnInit {
f1:boolean = true;
f2:boolean = false;
ff:boolean = false;
b1:string ="show";
flag:boolean = false;
names:Array<string>=["Raj","Seeta","Reeta","Ajay","Vijay"];
employees:Array<Employee>=[];

  constructor() { }
  // life cycle method call after constructor. 
  ngOnInit(): void {
    let emp1 = new Employee(100,"Raj",21);
    let emp2 = new Employee(101,"Ravi",23);
    let emp3 = new Employee(102,"Ramesh",25);
    let emp4 = new Employee(103,"Rajesh",28);
    this.employees.push(emp1);
    this.employees.push(emp2);
    this.employees.push(emp3);
    this.employees.push(emp4);
  }

  fun() {
    this.ff = true;
  }

  change() : void {
    if(this.flag){
        this.flag = false;
        this.b1 = "show";
    }else {
      this.b1 = "hide";
        this.flag = true;
    }
  }
}
