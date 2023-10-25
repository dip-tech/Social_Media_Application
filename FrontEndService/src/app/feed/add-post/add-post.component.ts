import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-post',
  templateUrl: './add-post.component.html',
  styleUrls: ['./add-post.component.css']
})
export class AddPostComponent implements OnInit {
  $IMAGE_PATH: any = null;
  $SHOW_IMAGE: boolean = false;
  


  ngOnInit(): void {

  }

  onFileChange(event) {
    console.log(event.target.files[0])
    var reader = new FileReader();
    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event) => {
      this.$IMAGE_PATH = (<FileReader>event.target).result;
      this.$SHOW_IMAGE = true;
      console.log(this.$IMAGE_PATH)

    }
    

  }

  removeFile(){
    this.$IMAGE_PATH=null;
    this.$SHOW_IMAGE=false;
  }
}
