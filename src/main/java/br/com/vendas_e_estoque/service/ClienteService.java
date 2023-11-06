package br.com.vendas_e_estoque.service;

import java.util.ArrayList;
import java.util.List;

import br.com.vendas_e_estoque.model.Cliente;

public class ClienteService implements I_CrudSystem<Cliente> {

	private static ClienteService clienteModel;

	private static List<Cliente> listCliente = new ArrayList<>();

	private ClienteService() {

	} 

	public static final ClienteService getInstance() {
		if (clienteModel == null) {
			clienteModel = new ClienteService(); 
		}
		return clienteModel;
	}

	@Override
	public void insert(Cliente obj) {
		this.listCliente.add(obj);
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

}
