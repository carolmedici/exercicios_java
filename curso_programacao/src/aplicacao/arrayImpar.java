package aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class arrayImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Números ímpares do 0 até o limite");
		System.out.println("Digite o número limite");
		int limite = sc.nextInt();
		int tamanhoArray = (limite + 1)/2;
		
		
		int[] impares = new int[tamanhoArray];
		int index = 0;
		for(int j=0; j<=limite;j++) {
			if(j % 2 !=0) {	
				impares[index] = j;
				index++;
			}
		}
		 System.out.println(Arrays.toString(impares));

		sc.close();
	}

}
