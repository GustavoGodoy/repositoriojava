package vetorMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		final int TAM = 2;
		double matriz[][] = new double[TAM][TAM];
		double matriz2[][] = new double[TAM][TAM];
		double matrizAux[][] = new double[TAM][TAM];
		int escolha, constante;
		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		// ENTRADA DAS MATRIZES
		for (int linha = 0; linha < TAM; linha++) {
			for (int coluna = 0; coluna < TAM; coluna++) {
				System.out.println("Digite a 1� Matriz --->");
				matriz[linha][coluna]=tc.nextDouble();
			}
		}
		for (int linha = 0; linha < TAM; linha++) {
			for (int coluna = 0; coluna < TAM; coluna++) {
				System.out.println("Digite a 2� Matriz --->");
				matriz2[linha][coluna]=tc.nextDouble();
			}
		}
		
		// ENTRADA DAS OP��ES
		System.out.println("O que voc� deseja?");
		System.out.println("1 - SOMAR DUAS MATRIZES");
		System.out.println("2 - SUBTRAIR AS MATRIZES");
		System.out.println("3 - ADICIONAR UMA CONSTANTE AS DUAS MATRIZES");
		System.out.println("4 - IMPRIMIR AS MATRIZES");
		escolha=tc.nextInt();
		
		//SAIDA DE ACORDO COM A ESCOLHA
		//OP��O 1
		if(escolha==1) {
			for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					matrizAux[linha][coluna]=matriz[linha][coluna]+matriz2[linha][coluna];
					System.out.print("["+matrizAux[linha][coluna]+"]");
				}
				System.out.println();
			}
		}
		
		//OP��O 2
		if(escolha==2) {
			for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					matrizAux[linha][coluna]=matriz[linha][coluna]-matriz2[linha][coluna];
					System.out.print("["+matrizAux[linha][coluna]+"]");
				}
				System.out.println();
			}
		
		}
		
		//OP��O 3
		if(escolha==3) {
			System.out.println("Digite uma constante para ser adicionada a tabela");
			constante = tc.nextInt();
			// ADI��O CONSTANTE + MATRIZ 1
			System.out.println("-------------- MATRIZ 1 + CONSTANTE -----------");
			for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					matriz[linha][coluna]+= constante;
					System.out.print("["+matriz[linha][coluna]+"]");
				}
				System.out.println();
			}
			// ADI��O CONSTANTE + MATRIZ 2
			System.out.println("-------------- MATRIZ 2 + CONSTANTE -----------");
			for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					matriz2[linha][coluna]+= constante;
					System.out.print("["+matriz2[linha][coluna]+"]");
				}
				System.out.println();
			}
		}
		
		//OP��O 4
		if(escolha == 4) {
			//IMPRESSAO MATRIZ1
			System.out.println("------------ MATRIZ 1 ------------");
			for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					System.out.print("["+matriz[linha][coluna]+"]");
				}
				System.out.println();
			}
			//IMPRESS�O MATRIZ2
			System.out.println("------------ MATRIZ 2 ------------");
			for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					System.out.print("["+matriz2[linha][coluna]+"]");
				}
				System.out.println();
			}
			
		}
		
		tc.close();
	}
}
