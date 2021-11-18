import { Component, OnInit } from '@angular/core';
import { Customer } from 'src/app/model/customer';
import { CustomerService } from 'src/app/services/customer.service';

@Component({
  selector: 'app-ms-customer',
 templateUrl: './ms-customer.component.html',
  styleUrls: ['./ms-customer.component.css']
})
export class MsCustomerComponent implements OnInit {

  //filterPost='';
  customer!: Customer[];

  constructor(private customerService: CustomerService){ }

  ngOnInit(): void {
    this.customerService.getAll().subscribe(
      u=> this.customer=u
    );
  }

}
