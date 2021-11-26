import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { TdfLoginPageComponent } from './tdf-login-page/tdf-login-page.component';
import { MdfLoginPageComponent } from './mdf-login-page/mdf-login-page.component';
import { ReactiveFormsModule } from '@angular/forms';
import { TdfExamComponent } from './tdf-exam/tdf-exam.component';
@NgModule({
  declarations: [
    AppComponent,
    TdfLoginPageComponent,
    MdfLoginPageComponent,
    TdfExamComponent
  ],
  imports: [
    BrowserModule,FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
