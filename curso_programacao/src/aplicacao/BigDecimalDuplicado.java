package aplicacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class BigDecimalDuplicado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		BigDecimal numero ;
		
		ArrayList<BigDecimal> lista = new ArrayList<>();
		System.out.println("Quantos números terão na lista?");
		int quantidade = sc.nextInt();
		
		System.out.println("Insira os números");
		for(int i =0; i <quantidade; i++) {
			numero = sc.nextBigDecimal();
			
			
			lista.add(numero);
		}
		
		Set<BigDecimal> duplicados = new HashSet<>();
		Set<BigDecimal> numeroVisto = new HashSet<>();
		
	        for (BigDecimal n : lista) {
	            if (numeroVisto.contains(n)) {
	                
	                duplicados.add(n);
	            }else {
	            	numeroVisto.add(n);
	            }
	        }
		
	          
		System.out.println("A lista digitada foi: " + lista);
		System.out.println("Os números duplicados são: " + duplicados);
	
		sc.close();
	}

}