import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {

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



}
