import { Injectable } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';

import { Observable,of } from 'rxjs';

import { ErrorService } from './error.service';


@Injectable({
  providedIn: 'root'
})
export class HttpErrorHandler  {

  constructor(errorService:ErrorService){ }

  /*create handleError function that already knows the service name*/    
  //createHandleError=(serviceName='')=><T>
  //  (operation='operation',result = {} as T)=>this.handleError(serviceName,operation,result);

    /**
     * @param serviceName
     * @param operation
     * @param result
     * */ 
}