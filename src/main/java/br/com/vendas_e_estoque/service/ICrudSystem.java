package br.com.vendas_e_estoque.service;

import java.util.List;

import br.com.vendas_e_estoque.service.exceptions.VerificacaoCpfException;

public interface ICrudSystem <T> {
	
	public void inserir(T obj);
	
	public void deletar(T obj);
	
	public void atualizar(T obj);
	
	public List<T> listaTodosObjetos();

}
