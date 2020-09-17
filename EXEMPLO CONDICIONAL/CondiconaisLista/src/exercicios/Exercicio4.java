package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		double a;
		Scanner tc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero");
		a = tc.nextDouble();
		
		if(a%2==0) {
			System.out.println(a+" é um numero par");
			a = Math.sqrt(a);
			System.out.printf("A raiz quadrada deste numero é: %.5f",a);
		}else {
			System.out.println(a+" é um numero impar");
			a = Math.pow(a, 2);
			System.out.println("O quadrado deste numero é: "+a);
		}
	
		tc.close();
	}
	
}
