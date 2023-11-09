package br.com.vendas_e_estoque.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import br.com.vendas_e_estoque.model.domain.entities.Cliente;
import br.com.vendas_e_estoque.service.ClienteService;
import br.com.vendas_e_estoque.service.exceptions.VerificacaoCpfException;

public class ClienteController {

	private ClienteService clienteS = ClienteService.getInstance();
	private Cliente clienteM;
	private static List<Cliente> listCliente = new ArrayList<>();

	public ClienteService getClienteS() {
		return this.clienteS;
	}

	public void inserirClienteController() {

		try {
			clienteS.inserir(clienteM);
			clienteM = new Cliente();

		} catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());

		} catch (InputMismatchException imme) {
			System.out.println(imme.getMessage());

		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());

		}
	}

	public List<Cliente> listarTodosCliente() {
		listCliente = clienteS.listaTodosObjetos();
		return listCliente;
	}

	public void setClienteS(ClienteService clienteS) {
		this.clienteS = clienteS;
	}

	public String inserirTelefoneCliente(Cliente c) {
		return null;
	}

}
