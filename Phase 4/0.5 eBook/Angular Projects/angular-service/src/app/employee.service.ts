import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'      // this property is like a provider attribute in app.module.ts 
})
export class EmployeeService {

  constructor(public http: HttpClient) { }  // DI for HttpClient API


  // loadJsonData() {
  //   this.http.get("./assets/employees.json").
  //   subscribe(result=>console.log(result),error=>console.log("Error generated "+error),()=>console.log("completed"));
  // }

  loadJsonData() :Observable<Employee[]>{
    return this.http.get<Employee[]>("./assets/employees.json");
  }
}
