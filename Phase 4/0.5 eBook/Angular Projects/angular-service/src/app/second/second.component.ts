import { Component, OnInit } from '@angular/core';
import { CustomService } from '../custom.service';
import { MyService } from '../my.service';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {
  msg1:string="";
  msg2:string="";
  constructor(public cser:CustomService) { }    // DI for Service singltone object created. 

  ngOnInit(): void {
  }

  fun1() {
    let ser = new MyService();
    this.msg1=ser.sayHello();
  }
  fun2() {
    this.msg2 = this.cser.sayHello();
  }
}
