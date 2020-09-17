package vetorMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		final int TAM = 3;
		int matriz[][] = new int[TAM][TAM];
		int maiorDez = 0;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		for (int linha = 0; linha < TAM; linha++) {
			for (int coluna = 0; coluna < TAM; coluna++) {
				System.out.println("Digite um valor: ");
				matriz[linha][coluna] = tc.nextInt();
				if(matriz[linha][coluna]>10) {
					maiorDez++;
				}
				
			}
		}
			System.out.println();
		for (int linha = 0; linha < TAM; linha++) {
				for (int coluna = 0; coluna < TAM; coluna++) {
					System.out.print("["+matriz[linha][coluna]+"]\t");
					
					
				}
			System.out.println();
		}
		
		System.out.println((maiorDez>1)?"\nValores maiores que 10 existentes: "+maiorDez:(maiorDez==1)?"\nExiste apenas um valor maior que dez":"\nNão existe valor maior que dez");
	tc.close();
	}
	
}
