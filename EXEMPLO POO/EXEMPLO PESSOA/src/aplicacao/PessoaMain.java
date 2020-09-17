package aplicacao;

import java.util.Locale;

import entidades.Administrador;
import entidades.Fornecedor;
import entidades.Operario;
import entidades.Pessoa;
import entidades.Vendedor;

public class PessoaMain {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// PESSOA
		Pessoa pessoa1 = new Pessoa("José Mirtos","R. Marechal Deodoro","(11)94233-2321");
		System.out.println("PESSOA");
		System.out.println("NOME: "+pessoa1.getNome()+" END: "+pessoa1.getEndereco()+" TEL: "+pessoa1.getTelefone());
		System.out.print("--------------------------------------------------------------------------\n");
		// ADM - HERDA PESSOA
		Administrador adm1 = new Administrador("Tutifrutison Silva","R. Escaravelho","(11)93233-6621",90.0);
		System.out.println("ADMINISTRADOR");
		System.out.println("NOME: "+adm1.getNome()+" END: "+adm1.getEndereco()+" TEL: "+adm1.getTelefone()+ " \nAJUDA DE CUSTO: "+adm1.getAjudaDeCusto());
		System.out.print("--------------------------------------------------------------------------\n");
		// VENDEDOR - HERDA PESSOA
		Vendedor vendedor1 = new Vendedor("Alien Baraldi","R. Araucarias","(11)93332-6977",90.0,0.5);
		System.out.println("VENDEDOR");
		System.out.println("NOME: "+vendedor1.getNome()+" END: "+vendedor1.getEndereco()+" TEL: "+vendedor1.getTelefone());
		System.out.printf("VALOR BRUTO: R$ %.2f PORCENTAGEM DA COMISSÃO: %.2f = R$ %.2f \n",vendedor1.getValorProducao(),vendedor1.getComissao()*100,vendedor1.valorFinal());
		System.out.print("--------------------------------------------------------------------------\n");
		// OPERARIO - HERDA PESSOA
		Operario op1 = new Operario("Venancio Alexandre","R. Araras","(11)92222-4444",190.0,0.1);
		System.out.println("OPERÁRIO");
		System.out.println("NOME: "+op1.getNome()+" END: "+op1.getEndereco()+" TEL: "+op1.getTelefone());
		System.out.printf("VALOR BRUTO: R$ %.2f PORCENTAGEM DA COMISSÃO: %.2f  = R$ %.2f \n",op1.getValorProducao(),op1.getComissao()*100,op1.valorFinal());
		System.out.print("--------------------------------------------------------------------------\n");
		// FORNECEDOR - HERDA PESSOA
		Fornecedor fornecedor1 = new Fornecedor("Arquimedes Silva","R. 23 de Maio","(11)97070-2321",190.0,33.0);
		System.out.println("FORNECEDOR");
		System.out.println("NOME: "+fornecedor1.getNome()+" END: "+fornecedor1.getEndereco()+" TEL: "+fornecedor1.getTelefone());
		System.out.printf("Valor de credito: R$%.2f Valor divida: -R$%.2f\n",fornecedor1.getValorCredito(),fornecedor1.getValorDivida());
		fornecedor1.obterSaldo();
		System.out.print("--------------------------------------------------------------------------\n");
	}
}
