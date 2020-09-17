package vetorMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		/*
		*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		*e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira 
		*diagonal, ou seja, diagonal principal.
		*/
		
	
		// DECLARAÇÃO DE VARIAVEL, SCANNER E SET LOCALE
		final int TAM = 3;
		int matriz[][] = new int[TAM][TAM];
		int soma = 0;
		Locale.setDefault(Locale.US);		
		Scanner tc = new Scanner(System.in);
		
		//ENTRADA DE DADOS
		for (int linha = 0; linha < TAM; linha++) {
			for (int coluna = 0; coluna < TAM; coluna++) {
				System.out.println("Digite o numero da matriz ----> ");
				matriz[linha][coluna] = tc.nextInt();
				
				soma += matriz[linha][coluna];
				
				}
				
		}
		
		//QUEBRA DE LINHA
			System.out.println("");
			System.out.println("------------------ MATRIZ ------------------");
		
		//SAIDA DE DADOS
		for (int linha = 0; linha < TAM; linha++) {
			for (int coluna = 0; coluna < TAM; coluna++) {
				System.out.print("["+matriz[linha][coluna]+"]");
				System.out.print("\t");
			
				}
				System.out.println("");
		}
		
		//QUEBRA DE LINHA
			System.out.println("------------------ MATRIZ ------------------");
			System.out.println("");
		
		//SAIDA DE DADOS DA SOMA
		System.out.println("A soma de todos os valores é de: "+soma);
		soma = matriz[0][0]+matriz[1][1]+matriz[2][2];
		System.out.println("A soma da principal diagonal é de: "+soma);
		
		tc.close();

	}
}
