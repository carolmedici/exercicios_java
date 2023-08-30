package aplicacao;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o valor limite (-1) que terá a sequência de números do vetor");
	        int n = sc.nextInt();
	        int index = 0;
	        System.out.println("Qual o tamanho do vetor?");
	        int tamanho = sc.nextInt();
	        
	        int[] vetor = new int[tamanho];

	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = index;
	            index = (index + 1) % n;
	        }

	        for (int x = 0; x < vetor.length; x++) {
	            System.out.println("N[" + x + "] = " + vetor[x]);
	        }
	        sc.close();
	    }
	}