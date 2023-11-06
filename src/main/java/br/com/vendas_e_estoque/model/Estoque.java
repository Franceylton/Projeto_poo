package br.com.vendas_e_estoque.model;

import java.util.Date;

public class Estoque {

	private Integer cod_estoque;
	private String descricao_estoque;
	private Date data_saida_prod;
	private Date data_entrada_prod;
	
	public Estoque() {
		super();
	}

	public Estoque(Integer cod_estoque, String descricao_estoque, Date data_saida_prod, Date data_entrada_prod) {
		super();
		this.cod_estoque = cod_estoque;
		this.descricao_estoque = descricao_estoque;
		this.data_saida_prod = data_saida_prod;
		this.data_entrada_prod = data_entrada_prod;
	}

	public Integer getCod_estoque() {
		return cod_estoque;
	}

	public void setCod_estoque(Integer cod_estoque) {
		this.cod_estoque = cod_estoque;
	}

	public String getDescricao_estoque() {
		return descricao_estoque;
	}

	public void setDescricao_estoque(String descricao_estoque) {
		this.descricao_estoque = descricao_estoque;
	}

	public Date getData_saida_prod() {
		return data_saida_prod;
	}

	public void setData_saida_prod(Date data_saida_prod) {
		this.data_saida_prod = data_saida_prod;
	}

	public Date getData_entrada_prod() {
		return data_entrada_prod;
	}

	public void setData_entrada_prod(Date data_entrada_prod) {
		this.data_entrada_prod = data_entrada_prod;
	}

}
