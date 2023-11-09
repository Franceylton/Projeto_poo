package br.com.vendas_e_estoque.service.exceptions;

public class VerificacaoCpfException extends IllegalArgumentException {

	private static final long serialVersionUID = 4802224122558167437L;

	public VerificacaoCpfException(String msg) {
		super(msg);
	}

}
