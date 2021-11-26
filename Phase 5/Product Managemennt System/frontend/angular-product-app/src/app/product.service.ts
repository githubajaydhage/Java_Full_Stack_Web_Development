import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Product } from './product';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ProductService {
  url:string="http://localhost:9090/product/";

  constructor(public http: HttpClient) { }  // DI for HttpClient 


  storeProductInfo(product:Product):Observable<string>{
    // this.http.post("http://localhost:9090/product/storeProduct",product).
    // subscribe(result=>console.log(result),error=>console.log(error));

    return this.http.post(`${this.url}storeProduct`,product,{responseType:'text'})

  }

  retrieveAllProductInfo():Observable<Product[]> {
    return this.http.get<Product[]>(`${this.url}getAllProducts`)
  }

  retrieveFilterProduct(minValue:number,maxValue:number):Observable<Product[]> {
    return this.http.get<Product[]>(`${this.url}filterProduct/${minValue}/${maxValue}`,{responseType:'json'});
  }

  deleteProductInformation(pid:number):Observable<string>{
    return this.http.delete(`${this.url}deleteProductInfo/${pid}`,{responseType:'text'});
  }

  updateProductPrice(pid:number,price:number):Observable<string>{
    return this.http.put(`${this.url}updateProductPrice`,{pid:pid,price:price},{responseType:'text'});
  }
}
