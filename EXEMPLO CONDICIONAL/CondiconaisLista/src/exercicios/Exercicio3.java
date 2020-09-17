package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int idade;
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = tc.nextInt();
		
		if (idade>=10 && (idade<=14)) {
			
			System.out.println("Infantil");
			
		}else if (idade>=15 && idade<=17) {
			
			System.out.println("Juvenil");
			
		}else if (idade>=18 && idade<=25) {
			
			System.out.println("Adulto");
			
		}else {
			
			System.out.println("Idade invalida");
		}
	
	
	
	tc.close();
	
	}
	
	
	
}
