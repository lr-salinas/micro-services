import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/pages/home/home.component';
import { MsCustomerComponent } from './components/pages/ms-customer/ms-customer.component';
import { MsProductComponent } from './components/pages/ms-product/ms-product.component';
import { MsSaleComponent } from './components/pages/ms-sale/ms-sale.component';

const routes: Routes = [
  { path: 'homePage', component: HomeComponent, pathMatch: 'full' },
  { path: 'ms-customer', component: MsCustomerComponent, pathMatch: 'full' },
  { path: 'ms-product', component: MsProductComponent, pathMatch: 'full'},
  { path: 'ms-sale', component: MsSaleComponent, pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
