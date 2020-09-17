package entidades;

public class Aluno {
	
	public String nomeAluno;
	public int anoNascAluno;
	public char sexAluno, turmaAluno;
	public double nota[] = new double[4];
	public double media;
	
	public void mostra() {
		if(sexAluno == 'M') {
		System.out.printf("O nome do aluno é %s \nO sexo: Masculino",nomeAluno);
	}else
		{
		System.out.printf("O nome da aluna é %s \nO sexo: Feminino",nomeAluno);
		}
	}
	
	public void mostraIdade(int anoNascAluno) {
		
		System.out.printf("\nA idade é de %d anos", 2020-anoNascAluno);
		this.anoNascAluno = anoNascAluno;
	
	}
	
	public void media() {
		for (int i = 0; i < nota.length; i++) {
			media += nota[i];
		}
		media = media/4;		
	}
	
	public void testeAprovacao(double criterio) {
		
		System.out.println("\nA media foi de: "+media);
		System.out.println("O criterio da escola é de: "+criterio);
		
		if(media>criterio) {
			System.out.printf("%s FOI APROVADO(A)",nomeAluno);
		}else {
			System.out.printf("%s FOI REPROVADO(A)",nomeAluno);
		}

	}
}
