package br.com.vendas_e_estoque.controller;

import br.com.vendas_e_estoque.service.ClienteModel;

public class ClienteController {

	private ClienteModel clienteM = ClienteModel.getInstance();

	public ClienteModel getClienteM() {
		return clienteM;
	}
	
	public void inserir() {
		
	}

	public void setClienteM(ClienteModel clienteM) {
		this.clienteM = clienteM;
	}
	
	public void inserirCliente() {
		
	}

}
