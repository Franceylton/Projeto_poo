package br.com.vendas_e_estoque.model;

import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {

	private String matricula_func;
	private Departamento departamento;
	private double gratificacao;
	private String cargo;
	private String matricula_func_supervisor;
	private double salario_bruto;
	private Date data_admissao;
	private Date data_demissao;
	private Date data_inicio_trab_dep;
	private Date data_fim_trab_dep;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String cpf_pessoa, String nome, String sobrenome, char sexo, String email, Date data_nascimento,
			Endereco endereco, List<Telefone> telefone, String matricula_func, Departamento departamento,
			double gratificacao, String cargo, String matricula_func_supervisor, double salario_bruto,
			Date data_admissao, Date data_demissao, Date data_inicio_trab_dep, Date data_fim_trab_dep) {
		super(cpf_pessoa, nome, sobrenome, sexo, email, data_nascimento, endereco, telefone);

		this.matricula_func = matricula_func;
		this.departamento = departamento;
		this.gratificacao = gratificacao;
		this.cargo = cargo;
		this.matricula_func_supervisor = matricula_func_supervisor;
		this.salario_bruto = salario_bruto;
		this.data_admissao = data_admissao;
		this.data_demissao = data_demissao;
		this.data_inicio_trab_dep = data_inicio_trab_dep;
		this.data_fim_trab_dep = data_fim_trab_dep;

	}

	public String getMatricula_func() {
		return matricula_func;
	}

	public void setMatricula_func(String matricula_func) {
		this.matricula_func = matricula_func;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getMatricula_func_supervisor() {
		return matricula_func_supervisor;
	}

	public void setMatricula_func_supervisor(String matricula_func_supervisor) {
		this.matricula_func_supervisor = matricula_func_supervisor;
	}

	public double getSalario_bruto() {
		return salario_bruto;
	}

	public void setSalario_bruto(double salario_bruto) {
		this.salario_bruto = salario_bruto;
	}

	public Date getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Date data_admissao) {
		this.data_admissao = data_admissao;
	}

	public Date getData_demissao() {
		return data_demissao;
	}

	public void setData_demissao(Date data_demissao) {
		this.data_demissao = data_demissao;
	}

	public Date getData_inicio_trab_dep() {
		return data_inicio_trab_dep;
	}

	public void setData_inicio_trab_dep(Date data_inicio_trab_dep) {
		this.data_inicio_trab_dep = data_inicio_trab_dep;
	}

	public Date getData_fim_trab_dep() {
		return data_fim_trab_dep;
	}

	public void setData_fim_trab_dep(Date data_fim_trab_dep) {
		this.data_fim_trab_dep = data_fim_trab_dep;
	}

}
