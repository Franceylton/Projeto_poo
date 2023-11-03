package br.com.vendas_e_estoque.model.entities;

import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {

	private Date data_de_Cadastro;

	public Cliente(String cpf_pessoa, String nome, String sobrenome, char sexo, String email, Date data_nascimento,
			Endereco endereco, List<Telefone> telefone, Date data_de_Cadastro) {
		super(cpf_pessoa, nome, sobrenome, sexo, email, data_nascimento, endereco, telefone);

		this.data_de_Cadastro = data_de_Cadastro;
	}

	public Date getData_de_Cadastro() {
		return data_de_Cadastro;
	}

	public void setData_de_Cadastro(Date data_de_Cadastro) {
		this.data_de_Cadastro = data_de_Cadastro;
	}

}
