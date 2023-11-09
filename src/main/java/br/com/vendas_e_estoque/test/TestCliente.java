package br.com.vendas_e_estoque.test;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.vendas_e_estoque.model.domain.entities.Cliente;
import br.com.vendas_e_estoque.model.domain.entities.Endereco;
import br.com.vendas_e_estoque.model.domain.entities.Telefone;
import br.com.vendas_e_estoque.service.ClienteService;
import br.com.vendas_e_estoque.service.exceptions.VerificacaoCpfException;

public class TestCliente {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Endereco end = null;
		Cliente c = null;
		Telefone tel = null;
		String cpf_pessoa, nome, sobrenome, email;
		char sexo;
		Date data_nascimento;
		Endereco endereco;
		List<Telefone> telefone;

		Integer opcaoMenu = null;

		do {

			System.out.printf(
					"Para Inserir um Cliente, siga às Instruções à seguir." + "\n1. Insirir Informações Pessoais."
							+ "\n2. Inserir Endereço." + "\n3. Inserir telefone." + "\n-> ");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {
			case 1:
				
				do {
					try {

						System.out.printf("\n---------------------------------------");

						System.out.printf("\nInforme o CPF do Cliente: ");
						cpf_pessoa = ler.next();

						System.out.printf("\nInforme por 1º Nome: ");
						nome = ler.next();

						System.out.printf("\nInforme por 2º o Sobrenome: ");
						sobrenome = ler.next();

						c = new Cliente(nome, sobrenome, cpf_pessoa);
						ClienteService.getInstance().inserir(c);

						System.out.println("Cliente Salvo");
						break;

					} catch (NullPointerException npe) {
						System.out.println(npe.getMessage());
					} catch (VerificacaoCpfException vcpfe) {
						System.out.println(vcpfe.getMessage());
					}
					
				}while(true);

			case 2:
				break;

			case 3:
				break;
			}

		} while (opcaoMenu != 0);

	}
	
	private static Endereco Endereco(Endereco end) {
		
		return end;
	}
}
