import { Component, OnInit } from '@angular/core';
import { Template } from '../shared/models/template';
import { TemplateService } from '../services/template.service';
import { ActivatedRoute,Router } from '@angular/router';
//import { FormControl, FormGroup, Validators } from '@angular/forms';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-csvrecord',
  templateUrl: './add-csvrecord.component.html',
  styleUrls: ['./add-csvrecord.component.css']
})
export class AddCsvRecordComponent implements OnInit {
 
  private template: Template;
 
  constructor(private templateService: TemplateService,private router: Router) { }
 
  ngOnInit() {
	  this.template = this.templateService.getter();
  }
   processForm(form){
    console.log(this.template);
		  this.templateService.addTemplate(this.template).subscribe((data)=> {
			    this.router.navigate(['spread-sheet']);
		  });      
  }  
}