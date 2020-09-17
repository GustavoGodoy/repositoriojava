package aviao;

import java.util.Scanner;

public class PrincipalAviao {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		Scanner tc = new Scanner(System.in);
		int quantidade;
		
		System.out.println("Digite o modelo do avião: ");
		aviao1.modeloAviao = tc.nextLine().toUpperCase();
		System.out.println("Digite o tipo do avião:  (COMERCIAL | MILITAR | GOVERNO | PRIVADO)");
		aviao1.tipoAviao = tc.nextLine().toUpperCase();
		System.out.println("Digite a quantidade de passageiros suportado: ");
		aviao1.qtdPassageiros = tc.nextInt();
		System.out.println("Digite a porcentagem de combustivel no tanque: ");
		quantidade = tc.nextInt();
		
		
		aviao1.mostrarInfo();
		aviao1.mostrarCombustivel(quantidade);
		
		
		tc.close();
	}
}
