import { Component, EventEmitter, OnInit, SimpleChanges } from '@angular/core';
import { Auth } from 'src/app/models/auth/Auth';
import { AuthService } from '../auth.service';
import { JwtService } from '../jwt.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  auth: Auth = new Auth();
  user_NAME: String;

  ngOnInit() {
    

  }

  constructor(private authService: AuthService, private jwtservice: JwtService, private router: Router) { }

  doAuthenticate() {
    let res = this.authService.doLogin(this.auth)
    res.subscribe(data => {
      if (data != "AUTHENTICATION FAILED") {
        let decodeData = this.jwtservice.doDecodeToken(data);
        localStorage.setItem("user",JSON.stringify(decodeData));
        this.router.navigateByUrl("/feeds");
      }
      else{
        alert(data);
      }


    })
  }


}
