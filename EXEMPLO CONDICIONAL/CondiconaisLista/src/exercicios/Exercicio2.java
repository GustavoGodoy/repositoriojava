package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
	
		int a, b, c;
		Scanner tc = new Scanner(System.in);
	
		System.out.println("Digite o primeiro numero: ");
		a = tc.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = tc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		c = tc.nextInt();
	
	
		if(a>=b && b>=c) {
			
			System.out.println(c+","+b+","+a);
		}else if(b>=a && a>=c) {
			System.out.println(c+","+a+","+b);
		}else if(c>=a && a>=b) {
			System.out.println(b+","+a+","+c);
		}else if(c>=a && c>=b) {
			System.out.println(a+","+b+","+c);
		}else if(a>=b && c>=b) {
			System.out.println(b+","+c+","+a);
		}else if(b>=a && c>=a) {
			System.out.println(a+","+c+","+b);
		}
			
			

	tc.close();
	
	}
}
