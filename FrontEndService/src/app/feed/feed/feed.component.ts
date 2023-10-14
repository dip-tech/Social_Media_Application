import { Component, OnInit, inject } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FeedService } from '../feed.service';

@Component({
  selector: 'app-feed',
  templateUrl: './feed.component.html',
  styleUrls: ['./feed.component.css']
})
export class FeedComponent implements OnInit {
  
  constructor(private feedService:FeedService){}

  ngOnInit(): void {
  }

  doUpload():void{
    
  }

  onFileChanged(event) {
    // this.file = event.target.files[0];
    // console.log(this.file);
    // var reader = new FileReader();
    // reader.readAsDataURL(event.target.files[0]);
    // reader.onload = (event) => {
    //  this.imageShow = (<FileReader>event.target).result;
     
   }
   
  

}
