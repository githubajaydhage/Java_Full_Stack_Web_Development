import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees:Array<Employee>=[];
  flag:boolean = false;
  errMsg:string=""
  constructor(public empSer:EmployeeService) { }    // DI for EmployeeService 

  ngOnInit(): void {
  }

  loadJson() {
    this.flag = true;
    this.empSer.loadJsonData().
    subscribe(result=>this.employees=result,e=>this.errMsg=e,()=>console.log("completed"))
  }
}
