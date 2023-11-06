package br.com.vendas_e_estoque.service;

import java.util.ArrayList;
import java.util.List;

import br.com.vendas_e_estoque.model.Cliente;

public class ClienteModel implements I_CrudSystem<Cliente> {

	private static ClienteModel clienteModel;

	private static List<Cliente> listCliente = new ArrayList<>();

	private ClienteModel() {

	}

	public static final ClienteModel getInstance() {
		if (clienteModel == null) {
			clienteModel = new ClienteModel();
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
		// TODO Auto-generated method stub
		return null;
	}

}
