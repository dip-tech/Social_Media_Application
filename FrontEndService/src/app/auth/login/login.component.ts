import { Component, EventEmitter, OnInit, SimpleChanges } from '@angular/core';
import { Auth } from 'src/app/models/auth/Auth';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  auth:Auth=new Auth();
  user_NAME:String;

  ngOnInit() {

  }

  constructor(private authService:AuthService){}

  doAuthenticate(){
    let res=this.authService.doLogin(this.auth)
    res.subscribe(data=>{
      console.log(data)
    })
  }
  

}
