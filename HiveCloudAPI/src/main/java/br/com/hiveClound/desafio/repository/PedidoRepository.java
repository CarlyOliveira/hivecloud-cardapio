package br.com.hiveClound.desafio.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.hiveClound.desafio.model.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, String> {

}
