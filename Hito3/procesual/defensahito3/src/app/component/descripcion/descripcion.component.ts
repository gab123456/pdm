import { Component, OnInit, Input } from '@angular/core';


@Component({
  selector: 'app-descripcion',
  templateUrl: './descripcion.component.html',
  styleUrls: ['./descripcion.component.scss'],
})
export class DescripcionComponent implements OnInit {

  @Input('titulo') titulo:string;
  @Input('descripcion') descripcion:string;
  @Input('imagen') imagen:string
  constructor() { }

  ngOnInit() {}

}
