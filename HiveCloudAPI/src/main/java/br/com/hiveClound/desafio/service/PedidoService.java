package br.com.hiveClound.desafio.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

import br.com.hiveClound.desafio.model.Item;
import br.com.hiveClound.desafio.model.Pedido;
import br.com.hiveClound.desafio.model.Prato;
import br.com.hiveClound.desafio.repository.PratoRepository;

@Service
public class PedidoService {
	
	private PratoRepository pratoRepository;
	
	
	@Autowired
	public PedidoService(PratoRepository pratoRepository) {
		this.pratoRepository = pratoRepository;
	}
	
	
	private class ConvertPrato{		
		private int codigo;		
		private int quantidade;
	}
	
	
	public Pedido tratarSave(String data) {
		
		Gson gson = new Gson();
    	ConvertPrato[] convertPratos = gson.fromJson(data, ConvertPrato[].class);	
    	Set<Item> itens = new HashSet<Item>();
    	double valorPedido = 0;
    	
    	for (ConvertPrato convertPrato : convertPratos) {
			Prato prato = new Prato();
    		if(convertPrato.quantidade > 0) {
			 
    			prato = pratoRepository.findOne(Integer.toString(convertPrato.codigo));
			 
    			Item item = new Item();
    			item.setPrato(prato);
    			item.setQuantidade(convertPrato.quantidade);
    			item.setNomeItem(prato.getNome());
    			item.setValor(prato.getPreco() * item.getQuantidade());
    			itens.add(item);
    			
    			valorPedido += item.getValor();
			}
		}    	
    	
    	Pedido pedido = new Pedido();
    	
    	pedido.setItens(itens);
    	pedido.setValor(valorPedido);
    
    	return pedido;
	
	}

}
