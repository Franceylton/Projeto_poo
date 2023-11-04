package br.com.vendas_e_estoque.model.interfacesEntities;

import java.util.List;

import br.com.vendas_e_estoque.model.entities.Cliente;

public interface I_Cliente {
	
	public List<Cliente> filtrar_por_data_Cadastro(List<Cliente> obj);
	

}
