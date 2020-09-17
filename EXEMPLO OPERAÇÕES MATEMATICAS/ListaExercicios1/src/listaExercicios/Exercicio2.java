package listaExercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int anos=0, meses=0, dias;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidades de dias que você viveu: ");
		dias = teclado.nextInt();
		
		anos = dias / 365;
		meses = dias % 365 / 30;
		dias = dias % 365 % 30;
		
		System.out.printf("Você tem %d ano(s), %d mes(es), %d dia(s) de vida",anos,meses,dias);
		
		
		teclado.close();
	}
}
