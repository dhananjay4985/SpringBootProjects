import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { User } from '../shared/models/user';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  
  subjectURL: string ="http://localhost:8080/library";
	
	getAllSubject(){
			return this.http.get<Subject[]>(this.subjectURL);
	}
		
  
  }
