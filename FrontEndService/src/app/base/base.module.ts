import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NavbarComponent } from './navbar/navbar.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { RouterModule,Routes } from '@angular/router';

const routes:Routes=[
  {path:"",component:PageNotFoundComponent}
]

@NgModule({
  declarations: [
    NavbarComponent,
    PageNotFoundComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes)
  ],
  exports:[NavbarComponent,RouterModule]
})
export class BaseModule { }
