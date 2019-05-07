package br.com.hiveClound.desafio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Prato prato;
	
	private String nomeItem;
	
	private Integer quantidade;
	
	private Double valor;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	

	public Prato getPrato() {
		return prato;
	}

	public void setPrato(Prato prato) {
		this.prato = prato;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}	

	public String getNomeItem() {
		return nomeItem;
	}
	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", prato=" + prato + ", quantidade=" + quantidade + ", valor=" + valor + ", nomeItem="
				+ nomeItem + "]";
	}
	
	
	
}
