import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';

@Injectable({
  providedIn: 'root'
})
export class JwtService {

  constructor() { }

  doDecodeToken(token:string){
    const helper=new JwtHelperService();
    const tokenData=helper.decodeToken(token);
    return tokenData;
  }
}
