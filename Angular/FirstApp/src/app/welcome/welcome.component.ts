import { Component, OnInit } from '@angular/core';

@Component({
  selector:'tt-hello',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  message:String;
  constructor(){
  this.message = "TutorialsTeacher says ,Welcome to Angular6 Components "
  }
  

  ngOnInit() {
  }

}
