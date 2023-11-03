package br.com.vendas_e_estoque.model.entities;

import java.util.Date;
import java.util.List;

public class Venda {

	private Integer num_cupom_fiscal;
	private List<Cliente> cpf_cliente_compra;
	private List<Funcionario> cpf_func_venda;
	private double desconto;
	private double valor_total;
	private Date data_compra;

	public Venda(Integer num_cupom_fiscal, List<Cliente> cpf_cliente_compra, List<Funcionario> cpf_func_venda,
			double desconto, double valor_total, Date data_compra) {
		super();
		this.num_cupom_fiscal = num_cupom_fiscal;
		this.cpf_cliente_compra = cpf_cliente_compra;
		this.cpf_func_venda = cpf_func_venda;
		this.desconto = desconto;
		this.valor_total = valor_total;
		this.data_compra = data_compra;
	}

	public Integer getNum_cupom_fiscal() {
		return num_cupom_fiscal;
	}

	public void setNum_cupom_fiscal(Integer num_cupom_fiscal) {
		this.num_cupom_fiscal = num_cupom_fiscal;
	}

	public List<Cliente> getCpf_cliente_compra() {
		return cpf_cliente_compra;
	}

	public void setCpf_cliente_compra(List<Cliente> cpf_cliente_compra) {
		this.cpf_cliente_compra = cpf_cliente_compra;
	}

	public List<Funcionario> getCpf_func_venda() {
		return cpf_func_venda;
	}

	public void setCpf_func_venda(List<Funcionario> cpf_func_venda) {
		this.cpf_func_venda = cpf_func_venda;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public Date getData_compra() {
		return data_compra;
	}

	public void setData_compra(Date data_compra) {
		this.data_compra = data_compra;
	}

}
