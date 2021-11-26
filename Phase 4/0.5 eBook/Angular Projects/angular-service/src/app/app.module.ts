import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CustomService } from './custom.service';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { SecondComponent } from './second/second.component';
import { EmployeeComponent } from './employee/employee.component';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    SecondComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule,HttpClientModule
  ],
  providers: [CustomService],     // service class register 
  bootstrap: [AppComponent]
})
export class AppModule { }
