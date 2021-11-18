import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MsCustomerComponent } from './ms-customer.component';

describe('MsCustomerComponent', () => {
  let component: MsCustomerComponent;
  let fixture: ComponentFixture<MsCustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MsCustomerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MsCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
