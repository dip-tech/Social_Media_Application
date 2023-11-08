import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule,Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule } from  '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AuthService } from './auth.service';


const routes:Routes=[
  {path:"login",component:LoginComponent},
  {path:"signup",component:RegisterComponent}
]



@NgModule({
  declarations: [
    LoginComponent,
    RegisterComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forChild(routes)
   
  ],
  providers:[AuthService],
  exports:[RouterModule]
})
export class AuthModule { }
