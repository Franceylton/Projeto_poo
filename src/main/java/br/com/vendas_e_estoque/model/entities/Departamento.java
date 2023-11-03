package br.com.vendas_e_estoque.model.entities;

import java.util.Date;
import java.util.List;

public class Departamento {

	private Integer cod_departamento;
	private List<Funcionario> funcionario_gerente;
	private String descricao_departamento;
	private Date data_inicio_gerenciamento;
	private Date data_fim_gerenciamento;

	public Departamento(Integer cod_departamento, List<Funcionario> funcionario_gerente, String descricao_departamento,
			Date data_inicio_gerenciamento, Date data_fim_gerenciamento) {
		super();
		this.cod_departamento = cod_departamento;
		this.funcionario_gerente = funcionario_gerente;
		this.descricao_departamento = descricao_departamento;
		this.data_inicio_gerenciamento = data_inicio_gerenciamento;
		this.data_fim_gerenciamento = data_fim_gerenciamento;
	}

	public Integer getCod_departamento() {  
		return cod_departamento;
	}  

	public void setCod_departamento(Integer cod_departamento) {
		this.cod_departamento = cod_departamento;
	}

	public List<Funcionario> getFuncionario_gerente() {
		return funcionario_gerente;
	}

	public void setFuncionario_gerente(List<Funcionario> funcionario_gerente) {
		this.funcionario_gerente = funcionario_gerente;
	}

	public String getDescricao_departamento() {
		return descricao_departamento;
	}

	public void setDescricao_departamento(String descricao_departamento) {
		this.descricao_departamento = descricao_departamento;
	}

	public Date getData_inicio_gerenciamento() {
		return data_inicio_gerenciamento;
	}

	public void setData_inicio_gerenciamento(Date data_inicio_gerenciamento) {
		this.data_inicio_gerenciamento = data_inicio_gerenciamento;
	}

	public Date getData_fim_gerenciamento() {
		return data_fim_gerenciamento;
	}

	public void setData_fim_gerenciamento(Date data_fim_gerenciamento) {
		this.data_fim_gerenciamento = data_fim_gerenciamento;
	}

}
