import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import {User} from '../model/user.model';



  const httpOptions = { headers: new HttpHeaders({'ContentType':'alication:json'})
 };

/* @Injectable({
  providedIn: 'root'
}) */
@Injectable()
export class UserService {

  constructor(private http:HttpClient) {  }
  baseUrl: string ='http://localhost:8080/user-portal/users';

  public getUsers() {
   // let fakeUsers = [{id: 1, firstName: 'Dhiraj', lastName: 'bhosale', email: 'dhiraj@gmail.com'},
   //   {id: 2, firstName: 'vishal', lastName: 'Nathbone', email: 'vishal@gmail.com'},
   //   {id: 3, firstName: 'pritam', lastName: 'Gangarde', email: 'pritam@gmail.com'},
   //   {id: 4, firstName: 'Rohit', lastName: 'Baravkar', email: 'rohit@gmail.com'},
   // ];
   //  return Observable.of(fakeUsers).delay(5000);
    return this.http.get<User[]>(this.baseUrl);
   }

  public getUserById(id: number) {
	   return this.http.get<User>(this.baseUrl +'/'+ id);
  }

  public createUser(user: User) {
	    return this.http.post<User>(this.baseUrl,user);
  }
  public updateUser(user: User) {
      return this.http.put(this.baseUrl + '/' + user.id, user);
  }
  public deleteUser(id: number) {
	   return this.http.delete(this.baseUrl +'/' +id);
  }
}
