import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit{
  profileIcon:File;
  imageURL:any;
  ngOnInit(): void {
    
  }


  onFileChange(event){
    this.profileIcon=event.target.files[0];
    var reader = new FileReader();
    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event) => {
      this.imageURL = (<FileReader>event.target).result;
    }

  }


}
