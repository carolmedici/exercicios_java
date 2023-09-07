package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class numeroMaisRepetido {

	public static void main(String[] args) {
		
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Qual a quantidade de núemros?");
			int quantidade = sc.nextInt();
			
			List<Integer> lista = new ArrayList<>(quantidade);
			
			System.out.println("Digite os números:");
			for(int i = 0; i<quantidade; i++) {
				int numero = sc.nextInt();
				lista.add(numero);
			}
			
			
			Set<Integer> duplicados = new HashSet<>();
			Set<Integer> numeroVisto = new HashSet<>();
			
			int quantidadeRepeticao = 0;
			int numeroMaisRepetido = 0;
			int contaRepeticoes = 0;
			int numeroRepetido = 0;		
			
			for(int n : lista) {
				
				if(numeroVisto.contains(n)) {
					
					duplicados.add(n);
					
					contaRepeticoes = Collections.frequency(lista, n);
					numeroRepetido = contaRepeticoes;
					
					if(numeroRepetido > quantidadeRepeticao) {
						numeroMaisRepetido = n;
						quantidadeRepeticao = numeroRepetido;
					}
				}
				else {
					numeroVisto.add(n);
				}	
			} 
			
			System.out.println("Lista completa: " + lista);
			System.out.println("O número " + numeroMaisRepetido + "foi o mais repetido, aparecendo " + quantidadeRepeticao + " vezes.");
			sc.close();
		}

	}


