package br.com.vendas_e_estoque.model.controller;

import java.util.List;

import br.com.vendas_e_estoque.model.entities.Cliente;
import br.com.vendas_e_estoque.model.interfacesEntities.I_Cliente;
import br.com.vendas_e_estoque.model.interfacesEntities.I_CrudSystem;

public class Cliente_Implements implements I_CrudSystem<Cliente>, I_Cliente {

	@Override
	public void insert(Cliente obj) {
		if (obj != null) {

		}
	}

	@Override
	public void deletar(Cliente obj) {

	}

	@Override
	public void uptade(Cliente obj) {

	}

	@Override
	public List<Cliente> listObjects(Cliente obj) {
		return null;
	}

	@Override
	public List<Cliente> filtrar_por_data_Cadastro(List<Cliente> obj) {
		return null;
	}
}
