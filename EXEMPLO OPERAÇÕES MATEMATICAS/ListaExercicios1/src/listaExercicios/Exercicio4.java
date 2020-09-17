package listaExercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		double a,b,c,d,r,s;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite A --->");
		a = teclado.nextDouble();
		System.out.println("Digite B --->");
		b = teclado.nextDouble();
		System.out.println("Digite C --->");
		c = teclado.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((c+b), 2);
		
		d = (r+s)/2;
		
		System.out.println("D = "+d);
		
		teclado.close();
	}

}
