package aplicacao;

import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Principal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Pitoco",2);
		Cavalo horse = new Cavalo("Alípio",12);
		Preguica sloth = new Preguica("João",23);
		
		System.out.println("\n--------------------------------CACHORRO----------------------------------");
		System.out.println("O cachorro vibra ao ver sua dona:");
		dog.emitirSom();
		System.out.println("\nApós avistar seu lanche o cachorro disparou.");
		dog.correr();
		System.out.println("\n--------------------------------CAVALO------------------------------------");
		System.out.println("O "+horse.getNome()+" após não encontrar nada para comer reclamou:");
		horse.emitirSom();
		System.out.println("\nEntão seu dono o chamou: "+horse.getNome()+" venha cá!");
		horse.correr();
		System.out.println("\n--------------------------------PREGUIÇA----------------------------------");
		System.out.println("A preguiça resolveu tentar escalar uma arvore que era muito grande: ");
		sloth.emitirSom();
		System.out.println("\nApós recusar-se ela cedeu e tentou: ");
		sloth.escalando();
		System.out.println();
	}

}
