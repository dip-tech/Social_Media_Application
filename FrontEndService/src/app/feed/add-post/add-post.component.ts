import { Component, OnInit } from '@angular/core';
import ClassicEditor from '@ckeditor/ckeditor5-build-classic';

@Component({
  selector: 'app-add-post',
  templateUrl: './add-post.component.html',
  styleUrls: ['./add-post.component.css']
})
export class AddPostComponent implements OnInit {
  $IMAGE_PATH: any = null;
  $SHOW_IMAGE: boolean = false;
  $LOGIN_USER_DATA:any;
  $ENABLE_APPLY_LINK_FIELD:boolean=false;
  public Editor=ClassicEditor;
  constructor(){}


  ngOnInit(): void {
    this.$LOGIN_USER_DATA=JSON.parse(localStorage.getItem("user"));

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

  easyApplyToggle(){
    if(this.$ENABLE_APPLY_LINK_FIELD==false){
      this.$ENABLE_APPLY_LINK_FIELD=true;
    }else{
      this.$ENABLE_APPLY_LINK_FIELD=false;
    }
  }
}
