import { Component } from '@angular/core';
import { DomSanitizer } from '@angular/platform-browser';
import { Router } from '@angular/router';
import { Products } from '../models/products';
import { FileHandle } from '../models/file-handle';
import { ProductsService } from '../services/products.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-manageproducts',
  imports: [FormsModule,CommonModule],
  templateUrl: './manageproducts.component.html',
  styleUrl: './manageproducts.component.css'
})
export class ManageproductsComponent {
  products: Products = new Products();
  submitted = false;
  errordata="";
constructor(private productsService: ProductsService,private router:Router,private sanitizer:DomSanitizer) { }

  ngOnInit()
  {

  }
  newProducts(): void {
    this.submitted = false;
  this.products = new Products();
  }

  save() {
    
    const formData=this.prepareFormData(this.products);
    this.productsService.createProducts(formData).subscribe(data => {
      if(data!=null)
      {
        alert("Products added successfully")
      console.log(data)
      this.gotoList();
      }
    }, 
    error =>{ console.log(error);
      this.errordata=error;
     
    })
  }
  prepareFormData(products:Products):FormData{
    const formData=new FormData()
    formData.append(
      'course',
      new Blob([JSON.stringify(products)],{type:"application/json"})
    );
    for(var i=0;i<products.productsImages.length;i++)
    {
      formData.append(
        'imageFile',
        products.productsImages[i].file,
        products.productsImages[i].file.name
      );
    }
    return formData;
  }
  removeImage(i:number)
  {
    this.products.productsImages.splice(i,1)
  }
  onFileSelected(event:any){
    if(event.target.files)
    {
const file=event.target.files[0];
const fileHandle:FileHandle={
  file:file,
  url:this.sanitizer.bypassSecurityTrustUrl(window.URL.createObjectURL(file)),
  name:file.name


}
this.products.productsImages.push(fileHandle)
    }
  }
  onSubmit() {
    this.save();    
    this.submitted = true;
    console.log("inside on submit")
  }

  gotoList() {
    this.router.navigate(['/']);
  }

}