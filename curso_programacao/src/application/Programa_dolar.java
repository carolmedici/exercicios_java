package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Programa_dolar {
	
	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter valor = new CurrencyConverter();
		
		System.out.println("Insira o preço do dólar");
		valor.dolar = sc.nextDouble();
		System.out.println("Quantos dólares serão comprados?");
		valor.quantidade = sc.nextDouble();
		System.out.printf("Valor pago em reais = %.2f%n", valor.valorTotal());
				
		
		
		sc.close();
	
	
	}
}