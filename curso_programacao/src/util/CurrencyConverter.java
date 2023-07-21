package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public double quantidade;
	
	public double dolar;


	
	public double imposto() {
		return quantidade * IOF;
	}
	
	public double valorTotal () {
		return dolar * (quantidade + imposto());
	}

}