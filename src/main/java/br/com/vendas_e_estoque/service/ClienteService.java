package br.com.vendas_e_estoque.service;

import java.util.ArrayList;
import java.util.List;

import br.com.vendas_e_estoque.model.domain.entities.Cliente;
import br.com.vendas_e_estoque.model.util.MetodosValidadores;
import br.com.vendas_e_estoque.service.exceptions.VerificacaoCpfException;
import br.com.vendas_e_estoque.service.exceptions.VerifyNumInNameException;

public class ClienteService implements ICrudSystem<Cliente>, ICliente {

	private static ClienteService clienteService;
	private List<Cliente> listaCliente = new ArrayList<>();

	private ClienteService() {

	}

	public static final ClienteService getInstance() {
		if (clienteService == null) {
			clienteService = new ClienteService();
		}
		return clienteService;
	}

	@Override
	public void inserir(Cliente obj) throws NullPointerException, VerificacaoCpfException, VerifyNumInNameException {
		if (obj != null) {
			if (obj.getEndereco() != null) {
				if (obj.getTelefone() != null) {
					if (MetodosValidadores.verifCpfValido(obj.getCpf_pessoa()) == true) {
						if (MetodosValidadores.verificacaoNumInString(obj.getNome())
								&& MetodosValidadores.verificacaoNumInString(obj.getSobrenome())) {
							clienteService.listaCliente.add(obj);
						} else {
							throw new VerifyNumInNameException(
									"Faça a verificação do seu nome, não poderá conter números ou caracteres.");
						}
					} else {
						throw new VerificacaoCpfException("Insira um Cpf Válido");
					}
				} else {
					throw new NullPointerException(
							"Todas as informações do Telefone referente ao Cliente devem estar preenchidas.");
				}
			} else {
				throw new NullPointerException(
						"\"Todas as informações do Endereço referente ao Cliente devem estar preenchidas.\"");
			}
		} else {
			throw new NullPointerException("\"Todas as informações referentes ao Cliente devem estar preenchidas.\"");
		}
	}

	@Override
	public void deletar(Cliente obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Cliente obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buscarPorCpf(String cpf) {

	}

	@Override
	public List<Cliente> listaTodosObjetos() {
		List<Cliente> cc = new ArrayList<>();
		return cc;
	}

	public static ClienteService getClienteService() {
		return clienteService;
	}

	public static void setClienteService(ClienteService clienteService) {
		ClienteService.clienteService = clienteService;
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

}

//	@Override
//	public void inserir(Cliente clienteM) throws VerificacaoCpfException {
//		if (clienteM != null) {
//			if (MetodosValidadores.verifCpfValido(clienteM.getCpf_pessoa())) {
//				if (MetodosValidadores.verif_num_in_string(clienteM.getNome())
//						&& MetodosValidadores.verif_num_in_string(clienteM.getSobrenome())) {
//					this.listCliente.add(clienteM);
//					clienteM = new Cliente();
//
//				} else {
//					throw new VerifyNumInNameException("O nome ou o sobrenome não pode conter números.");
//				}
//			} else {
//				throw new VerificacaoCpfException("Cpf Inválido");
//			}
//		} else {
//			throw new NullPointerException("Preencha todas as Informações para Inserir o Cliente.");
//		}
//	}
//
//	@Override
//	public void deletar(Cliente obj) {
//
//	}
//
//	@Override
//	public void atualizar(Cliente obj) {
//
//	}
//
//	@Override
//	public List<Cliente> listaTodosObjetos() {
//
//		return null;
//	}
//
//	public static List<Cliente> getListCliente() {
//		return listCliente;
//	}
//
//	public static void setListCliente(List<Cliente> listCliente) {
//		ClienteService.listCliente = listCliente;
//	}
//	
//	
//
//}
