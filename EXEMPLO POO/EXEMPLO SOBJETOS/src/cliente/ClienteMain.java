package cliente;

import java.util.Locale;
import java.util.Scanner;

public class ClienteMain {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.println("Digite o nome do cliente: ");
		cliente1.nomeCliente = tc.nextLine();
		System.out.println("Digite a idade do cliente: ");
		cliente1.idadeCliente = tc.nextInt();
		System.out.println("Digite o sexo do cliente (M | MASCULINO) (F | FEMININO): ");
		cliente1.sexCliente = tc.next().toUpperCase().charAt(0);
		tc.nextLine();
		System.out.println("Digite a profissão que o cliente excerce: ");
		cliente1.profissaoCliente = tc.nextLine();
		
		cliente1.mostraInfo();
		tc.close();
	}
}
