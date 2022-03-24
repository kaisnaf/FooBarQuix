import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';
import {Result} from '../model/result';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {
  numberToConvert: number;
  convertedNumbersList: NumberConverted[] = [];

  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.numberToConvert = inputNumber;
    this.fooBarQuixService.getResultConvert(inputNumber)
      .subscribe((response: Result ) => {
        const numberConverted: NumberConverted = {numberToConvert: inputNumber, result: response.result};
        this.convertedNumbersList.push(numberConverted);
      });
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
