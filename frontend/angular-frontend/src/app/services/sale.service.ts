import { Injectable } from "@angular/core";
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Sale } from "../model/sale";

@Injectable({
  providedIn: 'root'
})
export class SaleService{

  private url:string="http://localhost:8181/ms-sale/v1/api/sale/products";

  constructor(private http:HttpClient){ }


  //COMPRAR PRODUCTO

  //VER LOS PRODUCTOS COMPRADOS POR UN USUARIO
  getAll():Observable<Sale[]>{
    return this.http.get<Sale[]>(this.url);
  }

  //ELIMINAR LOS PRODUCTOS COMPRADOS DE UN USUARIO


}
