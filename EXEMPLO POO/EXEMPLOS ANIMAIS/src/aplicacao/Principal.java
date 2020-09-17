package aplicacao;

import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class Principal {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Pitoco",2);
		Cavalo horse = new Cavalo("Al�pio",12);
		Preguica sloth = new Preguica("Jo�o",23);
		
		System.out.println("\n--------------------------------CACHORRO----------------------------------");
		System.out.println("O cachorro vibra ao ver sua dona:");
		dog.emitirSom();
		System.out.println("\nAp�s avistar seu lanche o cachorro disparou.");
		dog.correr();
		System.out.println("\n--------------------------------CAVALO------------------------------------");
		System.out.println("O "+horse.getNome()+" ap�s n�o encontrar nada para comer reclamou:");
		horse.emitirSom();
		System.out.println("\nEnt�o seu dono o chamou: "+horse.getNome()+" venha c�!");
		horse.correr();
		System.out.println("\n--------------------------------PREGUI�A----------------------------------");
		System.out.println("A pregui�a resolveu tentar escalar uma arvore que era muito grande: ");
		sloth.emitirSom();
		System.out.println("\nAp�s recusar-se ela cedeu e tentou: ");
		sloth.escalando();
		System.out.println();
	}

}
