package listaExercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double valor, impostoDist, imposto, somafinal;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do carro --->");
		valor = teclado.nextDouble();
		
		impostoDist = valor*0.28;
		System.out.println("A porcentagem do distribuidor é de: R$ " +impostoDist);
		imposto = valor * 0.45;
		System.out.println("O imposto é de: R$ " + imposto);
		somafinal = valor + impostoDist + imposto;
		
		System.out.printf("O valor final ficara em: R$ %.2f ", somafinal);
		
		teclado.close();

	}

}
