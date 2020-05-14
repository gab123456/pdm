import { Component, OnInit, Input } from '@angular/core';
import {HomePage} from '../../pages/home/home.page';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.scss'],
})
export class ButtonComponent implements OnInit {

  @Input('title') title:string;
  constructor(public slider: HomePage) { }

  ngOnInit() {}

  next(){
    this.slider.next();
  }
  prev(){
    this.slider.prev();
  }
}
