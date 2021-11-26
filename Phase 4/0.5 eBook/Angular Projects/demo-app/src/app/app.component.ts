import { Component } from '@angular/core';

@Component({
  selector: 'abc',         //<app-root></app-root>
  templateUrl: './app.component.html',    // connect to html page 
  styleUrls: ['./app.component.css']      // connect to css page 
})
export class AppComponent {

  id:number =100;
  name:string ="Raj Deep";
  age:number = 21;
  salary:number = 12000.50;
  result : boolean = true;

}
