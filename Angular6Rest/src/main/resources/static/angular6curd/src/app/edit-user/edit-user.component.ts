import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {UserService} from '../service/user.service';
import {FormGroup,FormBuilder,Validators} from '@angular/forms';
import {first} from 'rxjs/operators';
import {User} from '../model/user.model';


@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent implements OnInit {

  user: User;
  editForm: FormGroup;
  constructor(private userService: UserService, private router: Router,private formBuilder: FormBuilder) { }

  ngOnInit() {
    let userId = localStorage.getItem("editUserId");
	if(!userId) {
		alert("Invalid action");
		this.router.navigate(['list-user']);
		return;
	}
	this.editForm = this.formBuilder.group({
	 id:[],
	 email:['',Validators.required],
	 firstName:['',Validators.required],
	 lastName:['',Validators.required]
	});

	this.userService.getUserById(+userId)
	 .subscribe( data =>{
	    this.editForm.setValue(data);
	   });
  }
  onSubmit() {
	   this.userService.updateUser(this.editForm.value)
	    .pipe(first())
	       .subscribe(
	          data => {
		             this.router.navigate(['list-user']);
	 },
	 error => {
		alert(error);
	 });
  }
}
