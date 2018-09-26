import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {LoginComponent} from './login/login.component';
import {AddUserComponent} from './add-user/add-user.component';
import {ListUserComponent} from './list-user/list-user.component';
import {EditUserComponent} from './edit-user/edit-user.component';
import {AddHeaderComponent} from './add-header/add-header.component';

const routes: Routes =[
{path: 'login',component:LoginComponent},
{path: 'add-user',component:AddUserComponent},
{path: 'list-user',component:ListUserComponent},
{path: 'edit-user',component:EditUserComponent},
{path: 'add-header',component:AddHeaderComponent},
{path: '',component:LoginComponent}
];

/* @NgModule({
  imports:[RouterModule.forRoot(routes),
    CommonModule
  ],
  exports:[RouterModule],
  declarations: []
}) */
export const routing = RouterModule.forRoot(routes);
