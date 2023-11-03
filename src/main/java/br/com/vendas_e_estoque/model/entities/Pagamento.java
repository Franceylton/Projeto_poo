package br.com.vendas_e_estoque.model.entities;

import java.util.Date;
import java.util.List;

public class Pagamento {

	private Integer cod_pagamento;
	private List<Venda> num_cupomfiscal_pag;
	private String tipo_pagamento;
	private Date data_pagamento;

	public Pagamento(Integer cod_pagamento, List<Venda> num_cupomfiscal_pag, String tipo_pagamento,
			Date data_pagamento) {
		super();
		this.cod_pagamento = cod_pagamento;
		this.num_cupomfiscal_pag = num_cupomfiscal_pag;
		this.tipo_pagamento = tipo_pagamento;
		this.data_pagamento = data_pagamento;
	}

	public Integer getCod_pagamento() {
		return cod_pagamento;
	}

	public void setCod_pagamento(Integer cod_pagamento) {
		this.cod_pagamento = cod_pagamento;
	}

	public List<Venda> getNum_cupomfiscal_pag() {
		return num_cupomfiscal_pag;
	}

	public void setNum_cupomfiscal_pag(List<Venda> num_cupomfiscal_pag) {
		this.num_cupomfiscal_pag = num_cupomfiscal_pag;
	}

	public String getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

}
