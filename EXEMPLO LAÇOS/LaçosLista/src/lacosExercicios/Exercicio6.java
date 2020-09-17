package lacosExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int num, soma = 0,media = 0;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		System.out.println("Para sair digite 0");
		
		do {
			System.out.println("Digite um numero: ");
			num = tc.nextInt();
			if(num != 0 && num % 3 == 0 ) {
				soma = num + soma;
				media= media+1;
			}
			
		}while(num != 0);
		
		media = soma/media;
		
		System.out.println("A media dos numeros multiplos de 3 é de: "+ media);
		tc.close();
	}
}
