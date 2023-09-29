package Frutas;

public class Fruta {

	private String nome;
	private String cor;
	private Double preco;
	
	public Fruta(String nome, String cor, Double preco) {
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
}
