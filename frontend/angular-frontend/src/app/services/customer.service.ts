import { Injectable } from "@angular/core";
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Customer } from "../model/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService{

  private url:string="http://localhost:8181/ms-customer/v1/api/customer/all";

  constructor(private http:HttpClient){ }

  //REGISTRAR CLIENTE

  //OBTENER TODOS LOS CLIENTES
  getAll():Observable<Customer[]>{
    return this.http.get<Customer[]>(this.url)
  }

  //OBTENER INFORMACIÓN DE UN CLIENTE POR ID
}
