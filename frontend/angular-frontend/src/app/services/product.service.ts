import { Injectable } from "@angular/core";
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Product } from "../model/product";

@Injectable({
  providedIn: 'root'
})
export class ProductService{

  private url:string="http://localhost:8181/ms-product/v1/api/product/all";

  constructor(private http:HttpClient){ }


  //CREAR PRODUCTO

  //LISTAR PRODUCTO
  getAll():Observable<Product[]>{
    return this.http.get<Product[]>(this.url);
  }

  //ACTUALIZAR PRODUCTO


}
