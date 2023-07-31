package entities;

public class ProdutoImportado extends Produto{

	private Double taxaAlfandega;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public Double PrecoFinal() {
		return super.getPreco() + taxaAlfandega;
	}
	
	@Override
	public String precoEtiqueta() {
		return getNome()
				+ " R$"
				+ String.format("%.2f",PrecoFinal())
				+ " (Taxa da Alfândega: R$"
				+ String.format("%.2f",taxaAlfandega)
				+ ")";
		
			
	}

}
