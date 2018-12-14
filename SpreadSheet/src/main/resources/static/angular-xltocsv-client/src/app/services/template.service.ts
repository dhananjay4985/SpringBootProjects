import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Template } from '../shared/models/template';
import { Observable} from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class TemplateService {

  constructor(private http:HttpClient) {  }
  
  httpOptions = {
	  headers: new HttpHeaders({
		  'Content-Type':'application/json'
	  })
  };
  private template = new Template();
	private templates: Template[];
  
  baseURL: string  = "http://localhost:8080/spread-sheet";

	getAllTemplates():Observable<Template[]>{		
		return this.http.get<Template[]>(this.baseURL+'/alltemplates/',this.httpOptions);
	}		
	addOnUpload(templates: Template[]):Observable<Template[]>{	
			console.log("In Service"+templates);	
			return this.http.post<Template[]>(this.baseURL+'/alltemplates/',templates,this.httpOptions);
	}
	addTemplate(template: Template):Observable<Template>{		
			return this.http.post<Template>(this.baseURL+'/template/',template,this.httpOptions);	
	}	
	setter(template:Template){
		this.template = template;
	}
	getter(){
		return this.template;
	}
}