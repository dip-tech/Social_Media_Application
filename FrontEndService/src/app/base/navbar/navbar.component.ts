import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit{

  loginUserData:any;
  constructor(private router:Router){

  }
  ngOnInit(): void {
    this.loginUserData=JSON.parse(localStorage.getItem('user'));
  }

  @Input()
  currentTabHome:any;

  @Input()
  currentTabNetwork:any;

  @Input()
  currentTabJobs:any;

  @Input()
  currentTabMessaging:any;


  @Input()
  currentTabNotification:any;

  doSignOut(){
    localStorage.removeItem("user");
    this.router.navigateByUrl("/auth/login");

  }



}
