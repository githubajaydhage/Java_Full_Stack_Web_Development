import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {
  
  msg:string="Hi";
  name:string="";
  constructor() { }

  ngOnInit(): void {
  }

  fun():void {
   // console.log("Event generate");
   this.msg ="Hello.";
  }

  passValue(nameRef:any): void {
    console.log(nameRef.value);
    this.name = nameRef.value;
  }
}
