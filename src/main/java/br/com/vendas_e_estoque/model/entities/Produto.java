package br.com.vendas_e_estoque.model.entities;

import java.util.Date;
import java.util.List;

public class Produto {

	private Integer cod_produto;
	private List<Estoque> cod_estoque;
	private String descricao_prod;
	private Date data_fabricacao_prod;
	private Date data_validade_prod;
	private String fabricante;
	private String distribuidor_prod;
	private int quantidade;
	private double valor_de_compra;
	private double valor_de_venda;

	public Produto(Integer cod_produto, List<Estoque> cod_estoque, String descricao_prod, Date data_fabricacao_prod,
			Date data_validade_prod, String fabricante, String distribuidor_prod, int quantidade,
			double valor_de_compra, double valor_de_venda) {
		super();
		this.cod_produto = cod_produto;
		this.cod_estoque = cod_estoque;
		this.descricao_prod = descricao_prod;
		this.data_fabricacao_prod = data_fabricacao_prod;
		this.data_validade_prod = data_validade_prod;
		this.fabricante = fabricante;
		this.distribuidor_prod = distribuidor_prod;
		this.quantidade = quantidade;
		this.valor_de_compra = valor_de_compra;
		this.valor_de_venda = valor_de_venda;
	}

	public Integer getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(Integer cod_produto) {
		this.cod_produto = cod_produto;
	}

	public List<Estoque> getCod_estoque() {
		return cod_estoque;
	}

	public void setCod_estoque(List<Estoque> cod_estoque) {
		this.cod_estoque = cod_estoque;
	}

	public String getDescricao_prod() {
		return descricao_prod;
	}

	public void setDescricao_prod(String descricao_prod) {
		this.descricao_prod = descricao_prod;
	}

	public Date getData_fabricacao_prod() {
		return data_fabricacao_prod;
	}

	public void setData_fabricacao_prod(Date data_fabricacao_prod) {
		this.data_fabricacao_prod = data_fabricacao_prod;
	}

	public Date getData_validade_prod() {
		return data_validade_prod;
	}

	public void setData_validade_prod(Date data_validade_prod) {
		this.data_validade_prod = data_validade_prod;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getDistribuidor_prod() {
		return distribuidor_prod;
	}

	public void setDistribuidor_prod(String distribuidor_prod) {
		this.distribuidor_prod = distribuidor_prod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor_de_compra() {
		return valor_de_compra;
	}

	public void setValor_de_compra(double valor_de_compra) {
		this.valor_de_compra = valor_de_compra;
	}

	public double getValor_de_venda() {
		return valor_de_venda;
	}

	public void setValor_de_venda(double valor_de_venda) {
		this.valor_de_venda = valor_de_venda;
	}

}
