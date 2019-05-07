import { PedidosService } from './../pedidos.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pedidos',
  templateUrl: './pedidos.component.html',
  styleUrls: ['./pedidos.component.css']
})
export class PedidosComponent implements OnInit {



pedidos: Array<any>;

  constructor(private pedidosService: PedidosService) { }

  ngOnInit() {
    this.getPedidos();
  }

  getPedidos(){
    this.pedidosService.getPedidos()
    .subscribe(data => this.pedidos = data);
    
  }  

}
