package br.com.hiveClound.desafio.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hiveClound.desafio.model.Prato;
import br.com.hiveClound.desafio.repository.CardapioRepository;

@RestController
@RequestMapping("/api/cardapio")
public class CardapioController {

    private CardapioRepository cardapioRepository;

    @Autowired
    public CardapioController(CardapioRepository cardapioRepository) {
        this.cardapioRepository = cardapioRepository;
    }

    @GetMapping
    public Iterable<Prato> findAll() {
        return cardapioRepository.findAll();
    }
}
