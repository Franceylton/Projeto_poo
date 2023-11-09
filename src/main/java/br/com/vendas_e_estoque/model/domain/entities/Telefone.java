package br.com.vendas_e_estoque.model.domain.entities;

public class Telefone {

	private String numeroTelefone;
	
	public Telefone() {
		super();
	}

	public Telefone(String numeroTelefone) {
		super();
		this.numeroTelefone = numeroTelefone;
	}

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

}
