package br.com.hiveClound.desafio.model;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Prato {
	
	@Id
	private String codigo;
	
	private String nome;
	
	private double preco;
	
	private String ac1;
	
	private String ac2;
	
	private String ac3;
	
	private String ac4;
	
	private String ac5;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getAc1() {
		return ac1;
	}

	public void setAc1(String ac1) {
		this.ac1 = ac1;
	}

	public String getAc2() {
		return ac2;
	}

	public void setAc2(String ac2) {
		this.ac2 = ac2;
	}

	public String getAc3() {
		return ac3;
	}

	public void setAc3(String ac3) {
		this.ac3 = ac3;
	}

	public String getAc4() {
		return ac4;
	}

	public void setAc4(String ac4) {
		this.ac4 = ac4;
	}

	public String getAc5() {
		return ac5;
	}

	public void setAc5(String ac5) {
		this.ac5 = ac5;
	}

	@Override
	public String toString() {
		return "Prato [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", ac1=" + ac1 + ", ac2=" + ac2
				+ ", ac3=" + ac3 + ", ac4=" + ac4 + ", ac5=" + ac5 + "]";
	}
	
	

}
