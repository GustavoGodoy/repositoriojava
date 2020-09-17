package entidades;

public class Terceiros extends Funcionario{

	private double horasAdicionais;
	
	public Terceiros() {
		
	}
	public Terceiros(String nome) {
		super(nome);
	}


	public Terceiros(String nome, double horasAdicionais) {
		super(nome);
		this.horasAdicionais = horasAdicionais;
	}


	public Terceiros(String nome, int horasTrabalhadas, double horasAdicionais) {
		super(nome, horasTrabalhadas);
		this.horasAdicionais = horasAdicionais;
	}


	public Terceiros(String nome, int horasTrabalhadas, double valorPorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.horasAdicionais = horasAdicionais;
	}
	
	
	public double getHorasAdicionais() {
		return horasAdicionais;
	}


	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}


	public double pagamento() {
		return super.pagamento() + (this.horasAdicionais * super.getValorPorHora());
	}
	
	

}
