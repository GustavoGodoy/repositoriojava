package bancario;

public class Conta {
	
	public String nomeTitular;
	public int numeroConta;
	public int digitoConta;
	public double valorConta;
	
	public void mostraInfo() {
		System.out.println("NOME TITULAR: "+nomeTitular);
		System.out.println("NUMERO DA CONTA: "+numeroConta+"-"+digitoConta);
		System.out.printf("VALOR NA CONTA: R$%.2f",valorConta);
	}
	
	public void depositar(double deposito) {
		valorConta += deposito;
		System.out.printf("\nSeu novo valor em conta: R$ %.2f", valorConta);
	}




}
