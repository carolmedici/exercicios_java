package entidade;

import entidade.Pessoa;

public class PessoaFisica extends Pessoa{

	private Double gastoSaude;
	

	public PessoaFisica(String nome, Double rendaAnual, Double imposto, Double gastoSaude) {
		super(nome, rendaAnual, imposto);
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double taxa() {
		
		return (rendaAnual*imposto) - (gastoSaude/2)  ;
	}
	
	
}