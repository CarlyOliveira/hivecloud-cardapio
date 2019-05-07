package br.com.hiveClound.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.hiveClound.desafio.model.Prato;

@Repository
public interface PratoRepository extends CrudRepository<Prato, String> {

}
