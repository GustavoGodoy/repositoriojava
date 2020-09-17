package vetorMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int valor[] = new int[6];
		int par = 0, somaPar = 0, impar = 0, somaImpar = 0;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		
		for (int i = 0; i < valor.length; i++) {
			System.out.println("Digite um valor----> ");
			valor[i] = tc.nextInt();
			if(valor[i]%2==0) {
				par++;
				somaPar += valor[i];
			}else {
				impar++;
				somaImpar += valor[i];
			}
		}
		
		System.out.printf("Existem %d valor(es) par(es)\n",par);
		System.out.printf("E a soma desse(s) valor(es) resulta em: %d\n", somaPar);
		System.out.printf("Existem %d valor(es) impar(es)\n",impar);
		System.out.printf("E a soma desse(s) valor(es) resulta em: %d", somaImpar);
	tc.close();
	}
	
}
