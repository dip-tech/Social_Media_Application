import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment.development';
@Injectable({
  providedIn: 'root'
})
export class FeedService {

  constructor(private http:HttpClient) { }

  doGetAllFeeds(){
    return this.http.get(environment.backendGateway+"feed/v1/get_all",{responseType:'json'})
  }
}
