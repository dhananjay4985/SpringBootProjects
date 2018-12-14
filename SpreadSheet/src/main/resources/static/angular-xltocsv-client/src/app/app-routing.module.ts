import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Routes,RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

import { SpreadSheetComponent } from './spread-sheet/spread-sheet.component';
import { AddCsvRecordComponent } from './add-csvrecord/add-csvrecord.component';

const routes: Routes =[ 
  {path: 'spread-sheet',component:SpreadSheetComponent},
  {path: 'add-csvrecord',component:AddCsvRecordComponent},
  {path: '',component:SpreadSheetComponent} 
  ];
  
@NgModule({
	imports:[RouterModule.forRoot(routes)],
	exports:[RouterModule]
})

export class AppRoutingModule{}
export const routingComponents = [SpreadSheetComponent,AddCsvRecordComponent];
