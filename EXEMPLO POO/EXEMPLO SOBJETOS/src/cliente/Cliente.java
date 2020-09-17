package cliente;

public class Cliente {
	public String nomeCliente;
	public int idadeCliente;
	public char sexCliente;
	public String profissaoCliente;
	
	public void mostraInfo() {
		if(sexCliente == 'M') {
			System.out.printf("O nome do cliente é: %s\n", nomeCliente);
			System.out.printf("A idade do cliente: %d\n", idadeCliente);
			System.out.printf("O cliente é do sexo masculino.\n");
			System.out.printf("A profissão que o cliente exerce: %s\n ",profissaoCliente);
		}else {
			System.out.printf("O nome da cliente é: %s\n", nomeCliente);
			System.out.printf("A idade da cliente: %d\n", idadeCliente);
			System.out.printf("O cliente é do sexo feminino.\n");
			System.out.printf("A profissão que a cliente exerce: %s\n ",profissaoCliente);
		}
	}
	
}
