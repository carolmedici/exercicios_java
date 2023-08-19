package Servico;

import java.time.LocalDate;

import entidade.Contrato;
import entidade.parcela;

public class ContratoServico {
	
	private ServicoPagamentoOnline servicoPagamentoOnline;
	
	public ContratoServico(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

		

	public void processoContrato(Contrato contrato, int meses) {
			double cotaBasica = contrato.getQuantia() / meses;
			for(int i = 1; i <= meses; i++) {
				   LocalDate dueDate = contrato.getDataVencimento().plusMonths(i);
		            double parcela = servicoPagamentoOnline.parcela(cotaBasica, i);
		            double taxa = servicoPagamentoOnline.taxaPagamento(cotaBasica + parcela);
		            double cota = cotaBasica + parcela + taxa;
		            contrato.getParcelas().add(new parcela(dueDate, cota));
			}

	}
	
	
}