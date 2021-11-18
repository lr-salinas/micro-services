import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from '../app/layout/navbar/navbar.component';
import { MsCustomerComponent } from './components/pages/ms-customer/ms-customer.component';
import { MsProductComponent } from './components/pages/ms-product/ms-product.component';
import { MsSaleComponent } from './components/pages/ms-sale/ms-sale.component';
import { HomeComponent } from './components/pages/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    MsCustomerComponent,
    MsProductComponent,
    MsSaleComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
