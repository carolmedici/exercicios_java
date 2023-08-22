package aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPares {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Números pares do 0 até o limite");
	System.out.println("Digite o número limite");
	int limite = sc.nextInt();
	int tamanhoArray = limite /2 + 1;
	
	int[] pares = new int[tamanhoArray];
	int index = 0;
	for(int j=0; j<=limite;j++) {
		if(j % 2 ==0) {			
			pares[index] = j;
			index++;
		}
	}	
		  System.out.println(Arrays.toString(pares));
	
	sc.close();
	}

}
