package br.com.vendas_e_estoque.model;

import java.util.List;

public class CarrinhoVendaProduto {

	private List<Venda> num_cupomfiscal_venda;
	private List<Produto> cod_produto_venda;
	private double valor_total;
	private int quantidad;

	public CarrinhoVendaProduto(List<Venda> num_cupomfiscal_venda, List<Produto> cod_produto_venda, double valor_total,
			int quantidad) {
		super();
		this.num_cupomfiscal_venda = num_cupomfiscal_venda;
		this.cod_produto_venda = cod_produto_venda;
		this.valor_total = valor_total;
		this.quantidad = quantidad;
	}

	public List<Venda> getNum_cupomfiscal_venda() {
		return num_cupomfiscal_venda;
	}

	public void setNum_cupomfiscal_venda(List<Venda> num_cupomfiscal_venda) {
		this.num_cupomfiscal_venda = num_cupomfiscal_venda;
	}

	public List<Produto> getCod_produto_venda() {
		return cod_produto_venda;
	}

	public void setCod_produto_venda(List<Produto> cod_produto_venda) {
		this.cod_produto_venda = cod_produto_venda;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public int getQuantidad() {
		return quantidad;
	}

	public void setQuantidad(int quantidad) {
		this.quantidad = quantidad;
	}

}
