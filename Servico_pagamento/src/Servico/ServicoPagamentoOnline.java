package Servico;


public interface ServicoPagamentoOnline {

	double taxaPagamento(Double quantia);
	double parcela(Double quantia, Integer meses);

}