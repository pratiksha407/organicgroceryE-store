import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Products } from '../models/products';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  private baseUrl = 'http://localhost:9009/products/products';

  constructor(private http: HttpClient) { }
 

  createProducts(products:FormData): Observable<Object> {
   
    return this.http.post(`${this.baseUrl}`, products);
  }
  getAll() {
   
    return this.http.get<Products[]>(`${this.baseUrl}`);
  }
  deleteproducts(productsid:number){
   
    return this.http.delete(`${this.baseUrl}`+"/"+productsid)
  }
}