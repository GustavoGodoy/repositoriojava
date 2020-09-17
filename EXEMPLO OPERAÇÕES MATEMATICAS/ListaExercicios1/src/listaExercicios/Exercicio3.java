package listaExercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int segundos, minutos, horas;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidades de segundos que durou o evento: ");
		segundos = teclado.nextInt();
		
		horas = segundos / 3600;
		minutos = segundos % 3600 / 60;
		segundos = segundos % 3600 % 60;
		
		System.out.printf("O evento durou %d horas, %d minutos, %d segundos",horas,minutos,segundos);
		
		
		teclado.close();
	}

}
