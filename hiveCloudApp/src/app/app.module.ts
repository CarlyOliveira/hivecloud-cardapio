import { PedidosService } from './pedidos.service';
import { HttpClientModule } from '@angular/common/http';
import { CardapioService } from './cardapio.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'; 


import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';







@NgModule({
  declarations: [
    AppComponent,
    routingComponents
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ CardapioService, PedidosService ],
  bootstrap: [AppComponent]
})
export class AppModule { }
