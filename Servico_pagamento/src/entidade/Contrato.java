package entidade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	private Integer numero;
	private LocalDate dataVencimento;
	private Double quantia;

	private List<parcela> parcelas = new ArrayList<>();
	
	public Contrato(Integer numero, LocalDate dataVencimento, Double quantia) {
		this.numero = numero;
		this.dataVencimento = dataVencimento;
		this.quantia = quantia;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public LocalDate getDataVencimento() {
		return dataVencimento;
	}



	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}



	public Double getQuantia() {
		return quantia;
	}



	public void setQuantia(Double quantia) {
		this.quantia = quantia;
	}



	public List<parcela> getParcelas(){
		return parcelas;
	}


	
	
	
	
	
		
}
