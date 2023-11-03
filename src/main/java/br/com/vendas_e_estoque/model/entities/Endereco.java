package br.com.vendas_e_estoque.model.entities;

public class Endereco {

	private String numero_end;
	private String cidade_end;
	private String estado_end;
	private String cep_end;
	private String rua_end;

	public Endereco(String numero_end, String cidade_end, String estado_end, String cep_end, String rua_end) {
		super();
		this.numero_end = numero_end;
		this.cidade_end = cidade_end;
		this.estado_end = estado_end;
		this.cep_end = cep_end;
		this.rua_end = rua_end;
	}

	public String getNumero_end() {
		return numero_end;
	}

	public void setNumero_end(String numero_end) {
		this.numero_end = numero_end;
	}

	public String getCidade_end() {
		return cidade_end;
	}

	public void setCidade_end(String cidade_end) {
		this.cidade_end = cidade_end;
	}

	public String getEstado_end() {
		return estado_end;
	}

	public void setEstado_end(String estado_end) {
		this.estado_end = estado_end;
	}

	public String getCep_end() {
		return cep_end;
	}

	public void setCep_end(String cep_end) {
		this.cep_end = cep_end;
	}

	public String getRua_end() {
		return rua_end;
	}

	public void setRua_end(String rua_end) {
		this.rua_end = rua_end;
	}

}
