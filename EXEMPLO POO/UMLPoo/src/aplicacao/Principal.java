package aplicacao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entidades.Funcionario;
import entidades.Terceiros;

public class Principal {
	public static void main(String[] args) {
		
		int num;
		char opc;
		String nome;
		int hora;
		double valorHora;
		double horaAdd;
		
		Scanner tc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.print("Digite o numero de funcionarios: ");
		num = tc.nextInt();
		
		for (int i=1; i <= num; i++) {
			System.out.println("CADASTRO FUNCIONARIO "+i+": ");
			System.out.print("TERCEIRO? [S/N]: ");
			opc = tc.next().toUpperCase().charAt(0);
			System.out.print("NOME: ");
			nome = tc.next().toUpperCase();
			System.out.print("HORAS TRABALHADAS: ");
			hora = tc.nextInt();
			System.out.print("VALOR HORA TRABALHADA: ");
			valorHora = tc.nextDouble();
			if(opc == 'S') {
				System.out.println("HORAS ADICIONAIS: ");
				horaAdd = tc.nextDouble();
				list.add(new Terceiros(nome,hora,valorHora,horaAdd));
			}else {
				list.add(new Funcionario(nome,hora,valorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS");
		for(Funcionario func:list) {
			System.out.println("NOME: "+func.getNome()+" | VALOR POR HORA R$"+func.getValorPorHora());
			System.out.println("R$"+func.pagamento());
		}
		
		
		
	tc.close();	
	}
}

