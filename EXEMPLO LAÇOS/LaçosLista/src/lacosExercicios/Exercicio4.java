package lacosExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int idade, sexo, comportamento, indice=0;
		int calmo = 0, mNervosa = 0, hAgressivo = 0, maiorNervoso = 0, menorCalmo = 0;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		
		while(indice<150) {
			System.out.println("Candidato numero: "+(indice+1));
			System.out.println("Digite sua idade: ");
			idade = tc.nextInt();
			System.out.println("Qual o seu sexo? | DIGITE 1 PARA FEMININO | DIGITE 2 PARA MASCULINO");
			sexo = tc.nextInt();
			System.out.println("Como você se comporta? | DIGITE 1 PARA CALMO | DIGITE 2 PARA NERVOSO(A) | DIGITE 3 PARA AGRESSIVO(A)");
			comportamento = tc.nextInt();
		
			if(comportamento==1) {
				calmo++;
			}
			if(sexo==1 && comportamento==2) {
				mNervosa++;
			}
			if(sexo==2 && comportamento==3) {
				hAgressivo++;
			}
			if(comportamento==2 && idade>40) {
				maiorNervoso++;
			}
			if(comportamento==1 && idade<18 && idade>0) {
				menorCalmo++;
			}
			System.out.println("Ok, OBRIGADO!\n\n");
			
			indice++;
		
		}
		
		System.out.println("Temos "+calmo+" pessoa(s) calma(s)");
		System.out.println("Temos "+mNervosa+" mulher(es) nervosa(s)");
		System.out.println("Temos "+hAgressivo+" homem(ns) agressivo(s)");
		System.out.println("Temos "+maiorNervoso+" pessoa(s) maior(es) de 40 anos nervosa(s)");
		System.out.println("Temos "+menorCalmo+" pessoa(s) menor(es) de 18 anos calma(s)");
		tc.close();
	}
	
}
