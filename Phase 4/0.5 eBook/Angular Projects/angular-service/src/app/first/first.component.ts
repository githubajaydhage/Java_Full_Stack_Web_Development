import { Component, OnInit } from '@angular/core';
import { CustomService } from '../custom.service';
import { MyService } from '../my.service';
@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
  msg1:string=""
  msg2:string="";
  constructor(public cser:CustomService) { }    // DI for service class

  ngOnInit(): void {
  }

  fun1() : void {
    let ser = new MyService;
    this.msg1 = ser.sayHello();
  }
  fun2() : void {
    this.msg2=this.cser.sayHello();
  }
}
