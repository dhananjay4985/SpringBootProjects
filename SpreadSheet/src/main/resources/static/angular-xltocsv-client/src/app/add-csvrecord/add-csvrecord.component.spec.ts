import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddCsvRecordComponent } from './add-csvrecord.component';

describe('AddCsvRecordComponent', () => {
  let component: AddCsvRecordComponent;
  let fixture: ComponentFixture<AddCsvRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddCsvRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddCsvRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
