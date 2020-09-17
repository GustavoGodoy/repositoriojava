package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		a = tc.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = tc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		c = tc.nextInt();
		
		if (a>b && a>c) {
			
			System.out.printf("O maior numero é %d",a);
			
		}else if(b>a && b>c) {
			
			System.out.printf("O maior numero é %d",b);
			
		}else {
			
			System.out.printf("O maior numero é %d",c);
		}
		
		tc.close();
	}

}
