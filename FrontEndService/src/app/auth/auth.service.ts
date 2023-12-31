import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Auth } from '../models/auth/Auth';
import { environment } from 'src/environments/environment';
import { User } from '../models/auth/User';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private httpClient:HttpClient) { }

  doLogin(auth:Auth){
    return this.httpClient.post(environment.backendGateway+"auth/v1/authenticate",auth,{responseType:'text'});
  }

  doSignup(user:User){
    return this.httpClient.post(environment.backendGateway+"auth/v1/signup",user,{responseType:'text'});
  }
}
