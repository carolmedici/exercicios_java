package Frutas;

public class Fruta {

	private String nome;
	private String cor;
	private Double preco;
	private disponibilidade disponibilidade;
	
	public Fruta(String nome, String cor, Double preco, disponibilidade disponibilidade) {
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.disponibilidade = disponibilidade;
		
	}

	public disponibilidade getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(disponibilidade disponibilidade) {
		this.disponibilidade = disponibilidade;
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
	
	
	  public static Fruta novaFruta(String dados) {
          String[] partes = dados.split(",");
        
          String nome = partes[0];
          String cor = partes[1];
          Double preco = Double.parseDouble(partes[2]);
          disponibilidade disponibilidade = null;
       
			return new Fruta(nome, cor, preco, disponibilidade);
	
      }
	
	
	
	
}
