import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tdf-exam',
  templateUrl: './tdf-exam.component.html',
  styleUrls: ['./tdf-exam.component.css']
})
export class TdfExamComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  questions=[
    {"question":"5+4","op1":"1","op2":"5","op3":"9","op4":"10","ans":"op3"},
    {"question":"5-4","op1":"1","op2":"0","op3":"9","op4":"9","ans":"op1"}
  ]
}
