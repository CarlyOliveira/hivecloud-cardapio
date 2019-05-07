import { Pedido } from './../shared/models/pedido';
import { Cardapio } from './../shared/models/cardapio';
import { PedidosService } from './../pedidos.service';
import { CardapioService } from './../cardapio.service';
import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2'


@Component({
  selector: 'app-cardapio',
  templateUrl: './cardapio.component.html',
  styleUrls: ['./cardapio.component.css']
})


export class CardapioComponent implements OnInit {

  pedidos = [] as Pedido[];
  cardapioModelList = [] as Cardapio[];
  cardapio: Array<any>;


  constructor(private cardapioService: CardapioService, private pedidosService: PedidosService) { }


  ngOnInit() {
    this.getCardapio();
  }

  getCardapio() {
    this.cardapioService.getCardapio()
      .subscribe(data => {
        this.cardapio = data;

        this.cardapio.forEach(c => {
          let cardapioModel = {} as Cardapio;

          cardapioModel.nome = c.nome;
          cardapioModel.ac1 = c.ac1;
          cardapioModel.ac2 = c.ac2;
          cardapioModel.ac3 = c.ac3;
          cardapioModel.ac4 = c.ac4;
          cardapioModel.ac5 = c.ac5;
          cardapioModel.preco = c.preco;
          cardapioModel.quantidade = 0;
          cardapioModel.codigo = c.codigo;
          this.cardapioModelList.push(cardapioModel);
        });

      })
  }

  onSubmit(form) {

    var enviar = false;

    this.pedidos = [] as Pedido[];
    this.cardapioModelList.forEach(c => {
      let pedido = {} as Pedido;
      pedido.codigo = c.codigo;
      pedido.quantidade = c.quantidade;
      this.pedidos.push(pedido);
      if (c.quantidade > 0 && enviar == false) {
        enviar = true;
      }
    });
    if (enviar) {
      this.pedidosService.postPedidos(this.pedidos);
    } else {
      return Swal.fire('Por favor, escolha um prato.', 'Para escolher o prato, informe a quantidade desejada.', 'info');
    }

  }
}
