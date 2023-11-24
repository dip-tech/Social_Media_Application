import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BaseviewComponent } from './base/baseview/baseview.component';



const routes: Routes = [
 
  
  {path:"",component:BaseviewComponent,children:[
    {path:"",redirectTo:"feeds",pathMatch:"full"},
    {path:"feeds",loadChildren:()=>import('./feed/feed.module').then(fm=>fm.FeedModule)}
  ]},
  {path:"auth",loadChildren:()=>import('./auth/auth.module').then(m=>m.AuthModule)},
  {path:"404",loadChildren:()=>import("./base/base.module").then(m=>m.BaseModule)},
  {path:"**",pathMatch:'full',redirectTo:'404/page-not-found'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
