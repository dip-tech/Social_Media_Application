import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BaseModule } from '../base/base.module';
import { RouterModule,Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { FeedComponent } from './feed/feed.component';
import { AddPostComponent } from './add-post/add-post.component';
import { environment } from 'src/environments/environment';
import { AngularFireModule } from '@angular/fire/compat';
import { AngularFireStorageModule } from '@angular/fire/compat/storage';
import { CKEditorModule } from '@ckeditor/ckeditor5-angular';

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
    FormsModule,
    CKEditorModule,
    RouterModule.forChild(routes),
    AngularFireModule.initializeApp(environment.firebase),
    AngularFireStorageModule
  ],
  exports:[RouterModule]
})
export class FeedModule { }
