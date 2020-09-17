import java.util.ArrayList;
import java.util.Collection;

public class Loja {

	public static void main(String[] args) {
		
		//INSTANCIANDO ARRAY
		Collection<String> estoque = new ArrayList<String>();
		
		//ADICIONANDO PRODUTO
		estoque.add("ARROZ");
		estoque.add("FEIJÃO");
		estoque.add("FARINHA DE TRIGO");
		estoque.add("LEITE");
		estoque.add("QUEIJO PRATO");
		
		//REMOVENDO PRODUTO
		estoque.remove("QUEIJO PRATO");
		estoque.remove("FARINHA DE TRIGO");
		
		//INSTANCIANDO UM NOVO ESTOQUE
		Collection<String> estoqueNovo = new ArrayList<String>();
		
		//ATUALIZANDO O ESTOQUE ANTIGO COM UM NOVO ESTOQUE
		estoqueNovo.add("SUCO");
		estoqueNovo.add("BANANA");
		
		estoque.addAll(estoqueNovo);
		
		//PRINTANDO TODOS OS ITENS DA LISTA
		
		for (String item:estoque) {
			
			System.out.println("ESTOQUE: "+item);
			
		}
		
		

	}

}
