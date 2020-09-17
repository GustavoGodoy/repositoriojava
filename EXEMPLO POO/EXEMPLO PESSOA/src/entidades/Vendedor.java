package entidades;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, double valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.valorVendas = valorProducao;
		this.comissao = comissao;
	}
	public double getValorProducao() {
		return valorVendas;
	}
	public void setValorProducao(double valorProducao) {
		this.valorVendas = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double valorFinal() {
		double valor = (this.valorVendas + (this.valorVendas * this.comissao));
		return valor;
	}

}
