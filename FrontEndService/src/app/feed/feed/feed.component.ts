import { Component, OnInit, inject } from '@angular/core';
import { FeedService } from '../feed.service';
import { AngularFireStorage } from '@angular/fire/compat/storage'

@Component({
  selector: 'app-feed',
  templateUrl: './feed.component.html',
  styleUrls: ['./feed.component.css']
})
export class FeedComponent implements OnInit {
  imageFile:File;
  constructor(private feedService:FeedService,private firebaseStorage:AngularFireStorage){}

  ngOnInit(): void {

  }

  doUpload():void{
    
  }

  async onFileChanged(event) {
    this.imageFile = event.target.files[0];
    console.log(this.imageFile);
    const uploadImage=await this.firebaseStorage.upload(`/feeds/${this.imageFile.name}`,this.imageFile);
    const url = await uploadImage.ref.getDownloadURL();
    console.log(url)


    // var reader = new FileReader();
    // reader.readAsDataURL(event.target.files[0]);
    // reader.onload = (event) => {
    //  this.imageShow = (<FileReader>event.target).result;
     
   }
   
  

}
