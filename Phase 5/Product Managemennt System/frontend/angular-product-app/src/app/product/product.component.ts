import { chainedInstruction } from '@angular/compiler/src/render3/view/util';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Product } from '../product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  insertMsg:string="";
  deleteMsg:string="";
  updateMsg:string="";
  products:Array<Product>=[];
  flag:boolean = false;
  updateId:number=0;
  updatePrice:number=0.0;
  constructor(public productSer:ProductService) { } // DI for Service class 

  // it call only once after component loaded..
  ngOnInit(): void {
   this.retrieveAllProducts();
  }

  storeProduct(productRef:NgForm){
    let product = productRef.value;
    //console.log(product);
      this.productSer.storeProductInfo(product).
      subscribe(result=>{
        this.insertMsg=result;
        this.retrieveAllProducts();     // calling once again to load the fresh data.  
      },error=>console.log(error));
    productRef.reset();
  }

  retrieveAllProducts(){
    this.productSer.retrieveAllProductInfo().subscribe(result=>this.products=result,error=>console.log(error));
  }

  seachProduct(min:any,max:any){
    let minValue = min.value;
    let maxValue = max.value;
   // console.log(minValue+" "+maxValue)
   this.productSer.retrieveFilterProduct(minValue,maxValue).subscribe(result=>this.products=result,error=>console.log(error));
  }

  deleteRecord(pid:any){
    console.log("Delete function called..."+pid);
    this.productSer.deleteProductInformation(pid).subscribe(result=>
      {
        this.deleteMsg=result;
        this.retrieveAllProducts();
      },error=>console.log(error));
  }

  updateRec(product:any){
    console.log(product);
    this.flag = true;
    this.updateId= product.pid;
    this.updatePrice=product.price;
  }

  updateDbRecord(){
    //console.log(this.updateId+" "+this.updatePrice);
    this.productSer.updateProductPrice(this.updateId,this.updatePrice).
    subscribe(result=> 
      {
        this.updateMsg=result
        this.retrieveAllProducts();
        this.flag=false;
      },error=>console.log(error))
  }

  fun(pid:any) {
    console.log("Event fired")
    console.log(pid.value);
  }
}
