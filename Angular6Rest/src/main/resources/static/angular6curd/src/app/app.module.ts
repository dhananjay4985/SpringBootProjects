import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';
import {AppComponent} from './app.component';
import {LoginComponent} from './login/login.component';
import {EditUserComponent} from './edit-user/edit-user.component';
import {ListUserComponent} from './list-user/list-user.component';
import {AddUserComponent} from './add-user/add-user.component';
import {AddHeaderComponent} from './add-header/add-header.component';
import {routing} from './app.routing';

import {UserService} from './service/user.service';
import {AuthService} from './service/auth.service';
import {HttpClientModule} from '@angular/common/http';



@NgModule({
  declarations: [
     AppComponent,
	   LoginComponent,
	   ListUserComponent,
     AddUserComponent,
	   EditUserComponent,
     AddHeaderComponent
  ],
  imports: [
    BrowserModule,
    routing,
    ReactiveFormsModule,
	  HttpClientModule
  ],
  providers: [UserService,AuthService],
  bootstrap: [AppComponent]
})
export class AppModule { }
