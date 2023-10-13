import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BaseModule } from '../base/base.module';
import { RouterModule,Routes } from '@angular/router';

import { FeedComponent } from './feed/feed.component';
import { AddPostComponent } from './add-post/add-post.component';

const routes:Routes=[
  {path:"feeds",component:FeedComponent}
]

@NgModule({
  declarations: [
    FeedComponent,
    AddPostComponent
  ],
  imports: [
    CommonModule,
    BaseModule,
    RouterModule.forChild(routes)
  ],
  exports:[RouterModule]
})
export class FeedModule { }
