package aluno;

import java.util.Scanner;

public class Aluno {
	public String nomeAluno;
	public String sexo;
	public int nota[] = new int[4];
	public double media;
	public boolean feminino;
	
	Scanner tc = new Scanner(System.in);
	

	
		void pegaInfo() {
			System.out.println("\nDigite seu nome: ");
			nomeAluno = tc.nextLine();
			System.out.println("Digite seu sexo \n M - PARA MASCULINO \n F - PARA FEMININO");
			sexo = tc.nextLine();
			
			if(sexo.equalsIgnoreCase("F")) {
				feminino = true;
				
			}else {
				feminino = false;
			}
			for (int i = 0; i < nota.length; i++) {
				System.out.printf("------------%d BIMESTRE----------\n",i+1);
				System.out.println("Digite sua nota: ");
				this.nota[i] = tc.nextInt();
				media += nota[i];
			}
			media /= 4;
		}
			void printInfo() {
			System.out.println("\nNome do aluno: "+nomeAluno);
			if(sexo.equalsIgnoreCase("f")) {
				System.out.println("SEXO: FEMININO");
			}else {
				System.out.println("SEXO: MASCULINO");
			}
			for (int i = 0; i < nota.length; i++) {
				System.out.printf("------------%d BIMESTRE----------\n",i+1);
				System.out.println("NOTA "+(i+1)+": "+nota[i]);
			}
			System.out.println("MEDIA DE: "+media+"\n");
		}
		
	}	
	

