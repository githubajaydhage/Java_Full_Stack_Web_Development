import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-tdf-login-page',
  templateUrl: './tdf-login-page.component.html',
  styleUrls: ['./tdf-login-page.component.css']
})
export class TdfLoginPageComponent implements OnInit {
  result:string="";
  constructor() { }

  ngOnInit(): void {
  }

  checkUser(loginRef:NgForm){
    //console.log(loginRef.value);
    let user = loginRef.value.user;
    let pass = loginRef.value.pass;
    if(user=="Raj" && pass=="123"){
        this.result = "Successfully login!";
    }else {
        this.result = "Failure try once again!";
    }
    loginRef.reset();
    
  }
}
