package listaExercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota ---> ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a 2ª nota ---> ");
		nota2 = teclado.nextDouble();
		System.out.println("Digite a 3ª nota ---> ");
		nota3 = teclado.nextDouble();
		
		media = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		
		System.out.println("A media final é de: "+ media);
	
		teclado.close();
		
	}

}
