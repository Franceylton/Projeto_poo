package br.com.vendas_e_estoque.model.interfacesEntities;

import java.util.List;

public interface I_CrudSystem <T> {
	
	public void insert(T obj);
	
	public void deletar(T obj);
	
	public void uptade(T obj);
	
	public List<T> listObjects(T obj);

}
