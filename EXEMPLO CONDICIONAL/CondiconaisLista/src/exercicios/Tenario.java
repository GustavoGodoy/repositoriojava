package exercicios;

import java.util.Locale;
import java.util.Scanner;



public class Tenario {

	public static void main(String[] args) {
		
		int sex = 0;
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite 1 para Masculino | Digite 2 para Feminino | Digite 3 para Outro");
		sex = tc.nextInt();
		
		System.out.println((sex==1)? "Masculino":(sex==2)? "Feminino":(sex==3)? "Outro":"COMANDO INVALIDO");
		
	
	tc.close();
	}

	
}
