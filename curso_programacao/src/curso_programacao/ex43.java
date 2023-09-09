package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int quantidadePares = 0;
		
		System.out.println("Quantos números terão na lista?");
		int quantidade = sc.nextInt();
		
		List<Integer> lista = new ArrayList<>();
		
		System.out.println("Digite os números desejados");
		for(int i = 0; i < quantidade; i++) {
			
			int numero = sc.nextInt();
			
			lista.add(numero);
		}
		
		List <Integer> listaPares = new ArrayList<>();
		
		for(int j = 0; j < lista.size(); j++) {
			
			int testeNumero = lista.get(index);
			
			if(testeNumero % 2 == 0) {
				listaPares.add(testeNumero);
				quantidadePares ++;
				
			}
			index++;
		}
		
		System.out.println("Lista digitada: " + lista);
		System.out.println("Lista de números pares: " + listaPares);
		System.out.println("Quantidade de números pares: " + quantidadePares);
		
		sc.close();

	}

}
