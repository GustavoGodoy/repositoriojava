package lacosExercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int idade = 0;
		int maior = 0, menor = 0;
		Scanner tc = new Scanner(System.in);
		
		
		
		
		while(idade != -99) {
			
			System.out.println("Digite sua idade: ");
			idade = tc.nextInt();
			
			if(idade>50) {
				maior++;
			}
			if(idade<21 && idade>=0) {
				menor++;
			}
			
			
		}
		System.out.println("Pessoas com menos de 21 anos: "+menor+"\nPessoas com mais de 50 anos: "+maior);
		tc.close();
	}
}
