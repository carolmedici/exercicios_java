package curso_programacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ex41 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Quantos números serão digitados?");
		int quantidade = sc.nextInt();
		
		if(quantidade > 1) {
			System.out.println("Digite os números:");
		}else {
			System.out.println("Digite o número");
		}
		
		List<Integer> lista = new ArrayList<>();  
		
		for(int i = 0; i <quantidade; i++) {
		
			int numero = sc.nextInt();
			lista.add(numero);					
		}	

		Set<Integer> duplicados = new HashSet<>();
		Set<Integer> numeroVisto = new HashSet<>();
			
			 for (int n : lista) {
		           if (numeroVisto.contains(n)) {
		               
		               duplicados.add(n);
		           }
		           else {
		            numeroVisto.add(n);
		           }
		       }
		     
		   List<Integer> numerosSemDuplicados = new ArrayList<>(numeroVisto);        
		   
		   System.out.println("Lista inteira: " + lista);
		   
		   System.out.println("Lista sem os números duplicados: " + numerosSemDuplicados);
		   
		   sc.close();
		}
		
	}


