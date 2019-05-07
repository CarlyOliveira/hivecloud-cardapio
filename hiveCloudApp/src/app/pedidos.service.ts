import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import Swal from 'sweetalert2';


@Injectable({
  providedIn: 'root'
})
export class PedidosService {

  urlPedidos = 'http://localhost:8080/api/Pedido';
  pedidos: Array<any>;

  constructor(private http: HttpClient) { }

  getPedidos() {
    return this.http.get<any[]>(`${this.urlPedidos}`)
  }

  postPedidos(pedidos) {
    return this.http.post<any>(`${this.urlPedidos}`, pedidos).subscribe(
      res => Swal.fire('Pedido realzado com sucesso!','Veja seus pedidos em listagem, Obrigado!',"success"),
      err => Swal.fire('Tente novamente!','Ocorreu um erro inesperado, por favor tente novamente.',"error")
    );
  }

}
