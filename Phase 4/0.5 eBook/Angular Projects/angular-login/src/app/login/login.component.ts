import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginRef = new FormGroup({
    email:new FormControl(),
    password:new FormControl()
  });

  constructor(public loginSer:LoginService) { } // DI for LoginService 

  ngOnInit(): void {
  }

  checkUser() {
    let login = this.loginRef.value;
    //console.log(login);
      this.loginSer.checkUser().subscribe(result=> {
        let leng = result.length;
        let flag = 0;
        for(let i=0;i<leng;i++){
              if(result[i].email==login.email && result[i].password==login.password){
                    flag++;
                    break;
              }
        }
        if(flag>0){
            console.log("Successfully Login ");
        }else {
            console.log("Failure try once again");
        }
      })
  }
}
