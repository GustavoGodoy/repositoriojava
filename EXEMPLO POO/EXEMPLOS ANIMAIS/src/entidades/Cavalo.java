package entidades;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}
	
	public void correr() {
		System.out.println("POTOC POTOC POTOC....");
	}
	
	public void emitirSom() {
		System.out.println("ESTOU COM FOME!!!! - RELINCHOU O CAVALO");
	}

}
