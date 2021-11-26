import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  loginRef = new FormGroup({
    email:new FormControl(),
    password:new FormControl()
  });

  constructor(public loginSer:LoginService) { } // DI for LoginService 

  ngOnInit(): void {
  }
  createAccount(){
    let login = this.loginRef.value;
    console.log(login);
    this.loginSer.createLogin(login);
  }
}
