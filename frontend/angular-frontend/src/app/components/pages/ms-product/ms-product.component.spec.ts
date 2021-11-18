import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MsProductComponent } from './ms-product.component';

describe('MsProductComponent', () => {
  let component: MsProductComponent;
  let fixture: ComponentFixture<MsProductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MsProductComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MsProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
