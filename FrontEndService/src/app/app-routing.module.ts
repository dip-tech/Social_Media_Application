import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';



const routes: Routes = [
 
  {path:"404",loadChildren:()=>import("./base/base.module").then(m=>m.BaseModule)},
  {path:"",loadChildren:()=>import("./feed/feed.module").then(m=>m.FeedModule)},
  {path:"auth",loadChildren:()=>import('./auth/auth.module').then(m=>m.AuthModule)},
  {path:"**",redirectTo:'404'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes,{useHash:true})],
  exports: [RouterModule]
})
export class AppRoutingModule { }
