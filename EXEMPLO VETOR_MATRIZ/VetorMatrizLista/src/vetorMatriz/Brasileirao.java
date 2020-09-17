package vetorMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Brasileirao {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIAVEIS
		final int RODADA = 3;
		String vtimes[] = {"Palmeiras", "São paulo", "Santos", "Corinthians"};
		String auxNome, resultado;
		int vpontos[] = new int[4];
		int aux;
		
		//INSTANCIAção DO TECLADO E LINGUAGEM
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		//LAÇO DE RODADAS
		for (int i = 0; i < RODADA; i++) {
			System.out.printf("------------------------ RODADA %d ------------------\n",i+1);
			
			//LAÇO DOS RESULTADOS DOS TIMES
			for (int j = 0; j < vtimes.length; j++) {	
			System.out.printf("%s ganhou ou perdeu? DIGITE G SE GANHOU | DIGITE E SE EMPATOU | DIGITE P SE PERDEU\n", vtimes[j]);
			System.out.print(">");
			resultado = teclado.next();
			System.out.println();
				if(resultado.equalsIgnoreCase("G")) {
				vpontos[j] +=3;
				}
				if(resultado.equalsIgnoreCase("E")) {
				vpontos[j] +=1;
				}
			}
			
		}
		
		//TESTE DE MAIOR PONTUAÇÃO E COLOCAÇÃO
		   for (int i = 0; i < vtimes.length; i++)
           {
               for (int j = 0; j < vtimes.length; j++)
               {
            	 //VALIDAÇÃO DOS PONTOS
                   if (vpontos[i] > vpontos[j])
                   {
                	   //TROCA DOS PONTOS APOS VALIDAÇÃO
                       aux = vpontos[i];
                       vpontos[i] = vpontos[j];
                       vpontos[j] = aux;
                       
                       //TROCA DOS NOMES ACOMPANHANDOS OS PONTOS
                       auxNome = vtimes[i];
                       vtimes[i] = vtimes[j];
                       vtimes[j] = auxNome;
                   }
               }
           }
		   
		 //QUEBRA DE LINHA  
		 System.out.println("\n");
	
		//SAIDA DE DADOS   
		for (int i = 0; i < vpontos.length; i++) {
			System.out.printf("\t\t-----------------------------%dº COLOCADO ------------------------\n\n",i+1); 
			System.out.println("\t\tO"+(i+1)+"º colocado é o "+ vtimes[i]+ " com um total de: "+vpontos[i]+"pt(s)\n");
		}
		
		
		teclado.close();
	}
}
