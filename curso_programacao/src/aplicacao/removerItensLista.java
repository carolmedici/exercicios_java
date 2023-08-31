package aplicacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removerItensLista {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		
		ArrayList<Integer> lista = new ArrayList<>();
		System.out.println("Quantos números terão na lista?");
		int quantidade = sc.nextInt();
		
		System.out.println("Insira os números");
		for(int i =0; i <quantidade; i++) {
			numero = sc.nextInt();
			
			
			lista.add(numero);
		}
		

		System.out.println("A lista digitada foi: " + lista);

		Set<Integer> listaRemovidos = new HashSet<>();
		Set<Integer> numeroVisto = new HashSet<>();
		
	        for (int n : lista) {
	            if (numeroVisto.contains(n)) {
	                
	          
	                listaRemovidos.add(n);
	                lista.remove(n);
	                break;
	            }else {
	            	numeroVisto.add(n);
	            }
	        }
		
	          
		System.out.println("Removendo os números duplicados, a lista fica assim: " + lista);
	
		sc.close();
	}

}