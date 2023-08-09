package Servico;

public class ServicoPaypal implements ServicoPagamentoOnline {

	private static final double taxa_porcentagem = 0.02;
	private static final double meses_parcela = 0.01;
	
	@Override
	public double taxaPagamento(Double quantia) {
		
		return quantia * taxa_porcentagem;
	}

	@Override
	public double parcela(Double quantia, Integer meses) {
		
		return quantia * meses_parcela * meses;
	}
	
	
	}