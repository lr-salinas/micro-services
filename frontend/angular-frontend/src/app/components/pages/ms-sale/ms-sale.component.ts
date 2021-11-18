import { Component, OnInit } from '@angular/core';
import { Sale } from 'src/app/model/sale';
import { SaleService } from 'src/app/services/sale.service';

@Component({
  selector: 'app-ms-sale',
  templateUrl: './ms-sale.component.html',
  styleUrls: ['./ms-sale.component.css']
})
export class MsSaleComponent implements OnInit {
 //filterPost='';
 sale!: Sale[];

  constructor(private saleService: SaleService) { }

  ngOnInit(): void {
    this.saleService.getAll().subscribe(
      u=> this.sale=u
    );
  }

}
