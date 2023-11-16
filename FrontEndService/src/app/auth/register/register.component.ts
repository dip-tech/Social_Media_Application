import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/auth/User';
import { UserDetails } from 'src/app/models/auth/UserDetails';
import { UserLogin } from 'src/app/models/auth/UserLogin';
import { AngularFireStorage } from '@angular/fire/compat/storage';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  profileIcon: File;
  imageURL: any;
  confrimPassword: String;

  user: User = new User();
  userLogin: UserLogin = new UserLogin();
  userDetails: UserDetails = new UserDetails();

  constructor(private firebaseService: AngularFireStorage, private authService: AuthService,private router:Router) {

  }

  ngOnInit(): void {

  }


  onFileChange(event) {
    this.profileIcon = event.target.files[0];
    var reader = new FileReader();
    reader.readAsDataURL(event.target.files[0]);
    reader.onload = (event) => {
      this.imageURL = (<FileReader>event.target).result;
    }

  }

  async saveProfilePicture(profilePicture: File) {
    const uploadImage = await this.firebaseService.upload(`/profile/${profilePicture.name}`, profilePicture);
    const url = <String>(await uploadImage.ref.getDownloadURL());
    return url;
  }

  async onSignup() {
    if (this.userLogin.password != this.confrimPassword) {
      alert("Confrim Password Not Matched :(");
    } else {
      this.user.userDetails = this.userDetails;
      this.user.userLogin = this.userLogin;
      this.userDetails.profile_PHOTO = await this.saveProfilePicture(this.profileIcon);
      let res=this.authService.doSignup(this.user);
      res.subscribe(data=>{
        if(data=="USER CREATED"){
            this.router.navigateByUrl("/auth/login");
        }else{
          alert(data);
        }
        console.log(data);
      });
    }



  }


}
