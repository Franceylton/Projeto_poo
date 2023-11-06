package br.com.vendas_e_estoque.model;

import java.util.Date;
import java.util.List;

public abstract class Pessoa {

	public String cpf_pessoa;
	public String nome;
	public String sobrenome;
	public char sexo;
	public String email;
	public Date data_nascimento;
	public Endereco endereco;
	public List<Telefone> telefone;

	public Pessoa() {
		super();
	}

	public Pessoa(String cpf_pessoa, String nome, String sobrenome, char sexo, String email, Date data_nascimento,
			Endereco endereco, List<Telefone> telefone) {
		super();
		this.cpf_pessoa = cpf_pessoa;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.email = email;
		this.data_nascimento = data_nascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getCpf_pessoa() {
		return cpf_pessoa;
	}

	public void setCpf_pessoa(String cpf_pessoa) {
		this.cpf_pessoa = cpf_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

}
