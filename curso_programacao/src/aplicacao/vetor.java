package aplicacao;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o valor limite (-1) que terá a sequência de números do vetor");
	        int n = sc.nextInt();
	        int index = 0;
	        
	        int[] vetor = new int[1000];

	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = index;
	            index ++;
	        }

	        for (int x = 0; x < vetor.length; x++) {
	            System.out.println("N[" + x + "] = " + vetor[x]);
	        }
	        sc.close();
	    }
	}