import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Products } from '../models/products';
import { ProductsService } from '../services/products.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-courses',
  imports: [CommonModule],
  templateUrl: './products.component.html',
  styleUrl: './products.component.css'
})
export class ProductsComponent  implements OnInit {
  products:Products[]=[]
login=false
 constructor(private productsService:ProductsService,private router:Router){

 }
 getAllProducts()
 {

   this.productsService.getAll().subscribe((response:Products[])=>{
     console.log(response)
     this.products=response
   },
   
   (error:HttpErrorResponse)=>{
     console.log(error)
    });
 }
 ngOnInit(): void {
   this.getAllProducts()
   console.log(localStorage.getItem("emailid"))
   if(localStorage.getItem("emailid")!=null)
    this.login=true
 }

enroll(id:any)
{
this.router.navigate(["/enroll",id])
}
}