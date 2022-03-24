import { Inject, Injectable, Optional } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Result } from './model/result';
import { catchError } from 'rxjs/operators';
import {HandleError, HttpErrorHandler} from './http-error-handler.service';
@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  private handleError: HandleError;

  constructor(
    private http: HttpClient,
    httpErrorHandler: HttpErrorHandler,
    @Optional() @Inject('SERVER_URL') protected serverUrl: string) {
    this.handleError = httpErrorHandler.createHandleError('FooBarQuixService');
  }

  /** GET convertValue from the server */
  getResultConvert(inputNumber: number): Observable<Result> {
    return this.http.get<any>(`${this.serverUrl}/foo-bar-quix/${inputNumber}`)
      .pipe(
        catchError(this.handleError('getResult', []))
      );
  }
}
