import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  age : number = 21;
  b1:boolean = false;
  b2:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

}
