package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex47 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual será o tamanho da lista?");
		int tamanho = sc.nextInt();
		
		List<Integer> listaNumeros = new ArrayList<>();
		
		System.out.println("Digite os números da lista");
		
		for(int i = 0; i < tamanho; i++) {
			int numero = sc.nextInt();
			listaNumeros.add(numero);
			
		}
		
		System.out.println("Escolha uma posição na lista de 0 a " + (tamanho - 1));
		
		int index = sc.nextInt();
		
		 
		
		while(index > (tamanho - 1))
		{
			System.out.println("Erro: número maior que o limite da lista. Tente novamente");
			index = sc.nextInt();
		}
	
		
		
		System.out.println( "O número escolhido é o: "+ listaNumeros.get(index));
		System.out.println("Do lado direito dele fica o número " + listaNumeros.get(index+1) + " e do esquerdo o " + listaNumeros.get(index-1));
		
		
		System.out.println();
				
		sc.close();
	}

}
