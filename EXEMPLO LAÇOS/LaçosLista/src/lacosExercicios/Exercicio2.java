package lacosExercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int x[] = new int[10];
		int par=0, impar=0;
		Scanner tc = new Scanner(System.in);
				
		for (int i = 0; i < x.length; i++) {
			
			System.out.println("Digite um numero: ");
			x[i] = tc.nextInt();
			
			if(x[i]%2==0) {
				par++;
			}else {
				impar++;
			}
			
		}
		System.out.printf("Quantidade de numeros pares: %d \nQuantidade de numeros impares: %d ",par,impar);
		tc.close();
	}

}
