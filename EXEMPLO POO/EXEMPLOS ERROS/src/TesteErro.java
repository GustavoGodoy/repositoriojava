import java.util.Locale;
import java.util.Scanner;

public class TesteErro {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		try {
			System.out.println("Digite uma sequencia de nomes: ");
			String nome[] = tc.nextLine().toUpperCase().split(" ");
		
			for(String nome1:nome) {
				System.out.println("NOME: "+nome1);
			}
		
			System.out.println("\nEscolha a posi��o da lista: ");
			int pos = tc.nextInt();
			System.out.println("\nNOME: "+nome[pos-1]);
		}catch(java.util.InputMismatchException erro) {
			System.out.println("VOC� N�O DIGITOU UM NUMERO - DIGITE UM NUMERO VALIDO");
		}catch(java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("VOC� EXCEDEU OS LIMITES DA POSI��O - DIGITE UMA POSI��O VALIDA");
		}
		
		System.out.println("\nFIM DO PROGRAMA");
		tc.close();
	}
}
