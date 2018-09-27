import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {first} from 'rxjs/operators';
//import {AuthService} from '../service/auth.service';

@Component({
  selector: 'app-login-user',
  templateUrl: './login-user.component.html',
  styleUrls: ['./login-user.component.css']
})
export class LoginUserComponent implements OnInit {

  loginForm: FormGroup;
  submitted: boolean = false;
  invalidLogin: boolean = false;
  errorMessage: string = '';
  constructor(private formBuilder: FormBuilder,private router:Router,private authService:AuthService) { }
	
	
   onSubmit() {
	this.submitted = true;
	if(this.loginForm.invalid) {
		return;
	}
	if(this.loginForm.controls.email.value == 'admin@gmail.com' && this.loginForm.controls.password.value == 'admin@123'){
		this.router.navigate(['list-book']);
	}
	else{
		this.invalidLogin = true;
	}
	
  ngOnInit() {
  this.loginForm = this.formBuilder.group({
		email:['',Validators.required],
		password:['',Validators.required]
	});
  }
  }

}
