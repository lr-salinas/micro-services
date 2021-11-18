import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MsSaleComponent } from './ms-sale.component';

describe('MsSaleComponent', () => {
  let component: MsSaleComponent;
  let fixture: ComponentFixture<MsSaleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MsSaleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MsSaleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
