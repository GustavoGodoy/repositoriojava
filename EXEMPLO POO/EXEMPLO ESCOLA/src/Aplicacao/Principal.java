package Aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Principal {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		int ano;
		double criterio;
		
		System.out.println("SISTEMA DE CONTROLE ESCOLAR EM JAVA - POO");
		
		
		// CRIAR CLASSE ALUNO | EMTODADE
		// NOME - ANO NASC - SEXO CHAR - TURMA ALUNO CHAR
		System.out.println("Digite o nome do Aluno: ");
		aluno1.nomeAluno = tc.next().toUpperCase();
		
		System.out.println("Digite o sexo do Aluno (M|F): ");
		aluno1.sexAluno = tc.next().toUpperCase().charAt(0);

		for (int i = 0; i < aluno1.nota.length; i++) {
			System.out.println("Digite sua nota: ");
			aluno1.nota[i] = tc.nextDouble();
		}
		
		System.out.println("Digite o ano de nascimento do aluno: ");
		ano = tc.nextInt();
		
		System.out.println("Digite a media de criterio da escola -> ");
		criterio = tc.nextDouble();
		
		
		aluno1.mostra();
		aluno1.mostraIdade(ano);
		aluno1.media();
		aluno1.testeAprovacao(criterio);
		//MEDIA RETORNA PARA O PROGRAMA
		//ESCREVA NA TELA MEDIA ATUAL
		// ESCREVA REPROVADO OU APROVADO
	
	tc.close();
	}

}
