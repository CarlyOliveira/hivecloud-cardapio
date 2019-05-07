import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CardapioService {

  urlCardapio = 'http://localhost:8080/api/cardapio'
  
  constructor(private http: HttpClient) { }

  getCardapio(){
    return this.http.get<any[]>(`${this.urlCardapio}`)
  }
}
