package curso_programacao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ex48 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
				
		System.out.println("Qual será o número de colunas?");
		int xColuna = sc.nextInt();
		
		System.out.println("Qual será o número de linhas?");
		int xLinha = sc.nextInt();
		
		String[][] tabela = new String[xLinha][xColuna]; 
		
		for(int linha = 0; linha < xLinha; linha++ ) {
			System.out.println("Digite os textos da linha " + (linha+1));
		
			for(int coluna = 0; coluna < xColuna; coluna++) {
			
				String texto = sc.next();
				tabela[linha][coluna] = texto;
				
			}
			
			
		}
		
		
			

	       
		
		
		
		/*
		 * Entrada desse método irá receber um Array Multidimensional e o valor da informação desejada.
		 * 
		 * Retornar um array composto de:
		 * 
		 * Coluna 0 - antecessor ao valor
		 * Coluna 1 - sucessor ao valor
		 * Coluna 2 - acima ao valor
		 * Coluna 3 - abaixo ao valor
		 * 
		 * @param arrayMultidimensional
		 * 
		 * @return array de Strings
		 
		public String[] arrayMultidimensionalPorValor(final String[][] arrayMultidimensional, final String valor);
		
*/
		
		sc.close();
		
	}

}