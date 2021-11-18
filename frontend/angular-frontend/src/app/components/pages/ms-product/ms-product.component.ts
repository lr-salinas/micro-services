import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/model/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-ms-product',
  templateUrl: './ms-product.component.html',
  styleUrls: ['./ms-product.component.css']
})
export class MsProductComponent implements OnInit {

  //filterPost='';
  product!: Product[];


  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getAll().subscribe(
      u=> this.product=u
    );
  }

}
