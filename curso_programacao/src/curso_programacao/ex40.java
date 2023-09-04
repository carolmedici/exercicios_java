package curso_programacao;

import java.util.ArrayList;
import java.util.Scanner;

public class ex40 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
	
		double preco = 1.50;
		
		ArrayList<String> listaProdutos = new ArrayList<String>(5);
		
		for(int i = 1001; i <=1005; i++) {
			preco += 1; 
			listaProdutos.add( i + " | R$ " + preco);
			
		}
		
		System.out.println("Informe a quantidade de itens:");
		
		int pedidos = sc.nextInt();
		
		for(int j = 0; j<pedidos; j++) {
			System.out.println("Qual o número do produto?");
			
			int numeroProduto = sc.nextInt();
			
			String produto = listaProdutos.get(j);
			System.out.println(produto);
			
			
			
			
		}
		
		sc.close();

	}

}
