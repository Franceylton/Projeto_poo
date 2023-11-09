package br.com.vendas_e_estoque.model.domain.entities;

import java.util.Date;
import java.util.List;

public class Dependente {

	private Integer cod_dependente;
	private List<Funcionario> cod_cpf_funcionario;
	private String nome_dependente;
	private Date data_cadastro;
	private Date data_retirada;
	
	public Dependente() {
		super();
	}

	public Dependente(Integer cod_dependente, List<Funcionario> cod_cpf_funcionario, String nome_dependente,
			Date data_cadastro, Date data_retirada) {
		super();
		this.cod_dependente = cod_dependente;
		this.cod_cpf_funcionario = cod_cpf_funcionario;
		this.nome_dependente = nome_dependente;
		this.data_cadastro = data_cadastro;
		this.data_retirada = data_retirada;
	}

	public Integer getCod_dependente() {
		return cod_dependente;
	}

	public void setCod_dependente(Integer cod_dependente) {
		this.cod_dependente = cod_dependente;
	}

	public List<Funcionario> getCod_cpf_funcionario() {
		return cod_cpf_funcionario;
	}

	public void setCod_cpf_funcionario(List<Funcionario> cod_cpf_funcionario) {
		this.cod_cpf_funcionario = cod_cpf_funcionario;
	}

	public String getNome_dependente() {
		return nome_dependente;
	}

	public void setNome_dependente(String nome_dependente) {
		this.nome_dependente = nome_dependente;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public Date getData_retirada() {
		return data_retirada;
	}

	public void setData_retirada(Date data_retirada) {
		this.data_retirada = data_retirada;
	}

}
