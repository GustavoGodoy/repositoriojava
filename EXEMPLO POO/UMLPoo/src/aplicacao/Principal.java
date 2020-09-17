package aplicacao;

import entidades.Funcionario;
import entidades.Terceiros;

public class Principal {
	public static void main(String[] args) {
		Funcionario novo = new Funcionario("Pedro Joao", 5, 50);
		Terceiros novo1 = new Terceiros("Alexandre Fernandes",6,50,2);
		System.out.println("\n----------------------------------------FUNCIONARIOS-----------------------------------------\n");
		System.out.println("NOME: " + novo.getNome() + "\nHORAS TRABALHADAS: "+novo.getHorasTrabalhadas()+"\nVALOR POR HORA: R$"+novo.getValorPorHora()+"\nVALOR A SER RECEBIDO: R$"+novo.pagamento());
		System.out.println("\n-----------------------------------------TERCEIROS--------------------------------------------\n");
		System.out.println("NOME: " + novo1.getNome() + "\nHORAS TRABALHADAS: "+novo1.getHorasTrabalhadas()+"\nHORAS ADICIONAIS: "+novo1.getHorasAdicionais()+"\nVALOR POR HORA: R$"+novo1.getValorPorHora()+"\nVALOR A SER RECEBIDO: R$"+novo1.pagamento());
	}
}
