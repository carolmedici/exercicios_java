package aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class arrayImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Números ímpares do 0 até o limite");
		System.out.println("Digite o número limite");
		int limite = sc.nextInt();
		int impar = 0;

		
		for(int i=0; i<=limite;i++) {
		if(i % 2 !=0) {
			impar ++;
		}
		
			}	
		
		int[] impares = new int[impar];
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
