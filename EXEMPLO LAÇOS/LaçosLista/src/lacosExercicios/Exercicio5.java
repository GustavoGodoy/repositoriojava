package lacosExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int num, soma=0;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			num = tc.nextInt();
			
			soma += num;
		}while(num !=0);
	
	
		System.out.println("A soma de todos os numeros é de: "+soma);
		tc.close();
	}

}
