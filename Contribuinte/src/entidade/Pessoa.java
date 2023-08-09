package entidade;

public abstract class Pessoa {
	
	protected String nome;
	protected Double rendaAnual;
	protected Double imposto;
		
	
	public Pessoa(String nome, Double rendaAnual, Double imposto) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.imposto = imposto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public Double getImposto() {
		return imposto;
	}


	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	
	public abstract double taxa();
		
	public String contribuinte() {
		return nome
				+ " R$"
				+ String.format("%.2f",taxa());
	}
	
	
	
}