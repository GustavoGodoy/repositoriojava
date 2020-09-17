package aviao;

public class Aviao {
	public String modeloAviao;
	public String tipoAviao;
	public int combustivelAviao;
	public int qtdPassageiros;
	
	public void mostrarInfo() {
		System.out.println("\nO MODELO DO AVIÃO É: ");
		System.out.println("---------> "+modeloAviao);
		System.out.println("\nDO TIPO: ");
		System.out.println("---------> "+tipoAviao);
		System.out.println("\nQUANTIDADE DE PASSAGEIROS SUPORTADA: ");
		System.out.println("---------> "+qtdPassageiros);
	}
	
	public void mostrarCombustivel(int quantidade) {
		combustivelAviao = quantidade;
		
		System.out.println("\n\n************************************** MEDIDOR DE COMBUSTIVEL *****************************************");
		System.out.print("0%");
		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}
		System.out.println("100%");
		System.out.print("  ");
		for (int i = 0; i < quantidade ; i++) {
			System.out.print("|");
			
		}
		System.out.println("\n\n************************************** ^ QUANTIDADE DISPONIVEL ^ *****************************************^");

		
		if(combustivelAviao<40) {
			System.out.println("\n\n\t\t\t\tABASTEÇA IMEDIATAMENTE!!!!!!!!!!!!!!!!!!!!!!!");
		}
	}
}
