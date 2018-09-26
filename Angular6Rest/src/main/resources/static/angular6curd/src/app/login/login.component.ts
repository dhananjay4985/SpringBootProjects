import {Component, OnInit} from '@angular/core';
import {FormBuilder,FormGroup,Validators} from '@angular/forms';
import {Router} from '@angular/router';
import {first} from 'rxjs/operators';
import {AuthService} from '../service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
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
	if(this.loginForm.controls.email.value == 'dhiraj@gmail.com' && this.loginForm.controls.password.value == '123'){
		this.router.navigate(['list-user']);
	}
	else{
		this.invalidLogin = true;
	}
  // login() {
  //   this.errorMessage = '';
  //   this.authService.login(this.loginForm.controls.email.value,this.loginForm.controls.password.value)
  //   .subscribe(
  //       data => {
  //         this.router.navigate(['list-user']);
  //         console.log(data);
  //       },
  //       err => {
  //         this.errorMessage = err;
  //         console.error(err);
  //       }
  //     );
  //  }
 }
  ngOnInit() {
	this.loginForm = this.formBuilder.group({
		email:['',Validators.required],
		password:['',Validators.required]
	});
  }
}
