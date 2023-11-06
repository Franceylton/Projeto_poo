package br.com.vendas_e_estoque.controller;

import br.com.vendas_e_estoque.service.ClienteService;

public class ClienteController {

	private ClienteService clienteS = ClienteService.getInstance();

	public ClienteService getClienteS() {
		return clienteS;
	}
	
	public void inserir() {
		
	}

	public void setClienteS(ClienteService clienteS) {
		this.clienteS = clienteS;
	}
	
	public void inserirCliente() {
		
	}

}
