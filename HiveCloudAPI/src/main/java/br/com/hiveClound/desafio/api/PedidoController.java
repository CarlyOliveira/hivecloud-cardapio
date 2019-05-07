package br.com.hiveClound.desafio.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hiveClound.desafio.model.Pedido;
import br.com.hiveClound.desafio.repository.PedidoRepository;
import br.com.hiveClound.desafio.service.PedidoService;

@RestController
@RequestMapping("/api/Pedido")
public class PedidoController {
	 
	
	private PedidoRepository pedidoRepository;
	private PedidoService pedidoService;
	

	@Autowired
	public PedidoController(PedidoRepository pedidoRepository,
							PedidoService pedidoService) {
	        this.pedidoRepository = pedidoRepository;
	        this.pedidoService = pedidoService;
	        
	}
	    
    @GetMapping
    public Iterable<Pedido> findAll() {
    	
    	Iterable<Pedido> listaDePedidos = pedidoRepository.findAll();
   	 	return listaDePedidos;
      
    }
    
    @PostMapping
    public void save(@RequestBody String data) throws Exception{
    	
    	pedidoRepository.save(pedidoService.tratarSave(data));
    	    	
    	
    }
}