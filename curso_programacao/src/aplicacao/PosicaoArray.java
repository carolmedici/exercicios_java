package aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class PosicaoArray {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Exercício para verificar a primeira e a última posição de um array, criando outro array com elas");
			System.out.println("Qual o tamanho do Array?");
			int tamanhoArray = sc.nextInt();
			int index = 0;
			
			int[]Array = new int[tamanhoArray + 1];
			
			for(int i = 0; i <tamanhoArray; i++) {
				Array[index] = i;
				index++;
			}
					
			int[]arrayResposta = new int[2];
					
				arrayResposta[0] = Array[0];
				arrayResposta[1] = Array[tamanhoArray-1];
					
				System.out.println(Arrays.toString(arrayResposta));
		
		sc.close();		
	}

}		
