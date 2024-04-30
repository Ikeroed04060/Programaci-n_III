import { Injectable } from '@angular/core';
import { Cliente } from './cliente';
import { Observable, map, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  private urlEndPoint: string = 'http://localhost:8080/api/clientes';

  constructor(private http: HttpClient) { }
  //Observable
  getClientes(): Observable<Cliente[]> {

    return this.http.get(this.urlEndPoint).pipe(
      map((response)=> response as Cliente[])
    );
  }



  //Tradicional
  /*getClientes():Cliente[]{
    return CLIENTES;
  }*/
}
