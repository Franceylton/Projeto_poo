package br.com.vendas_e_estoque.service.exceptions;

public class VerifyNumInNameException extends IllegalArgumentException {

	private static final long serialVersionUID = 7720414186615907347L;

	public VerifyNumInNameException(String msg) {
		super(msg);
	}

}
