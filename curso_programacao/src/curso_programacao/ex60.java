package curso_programacao;

import java.util.Scanner;

public class ex60 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 	
		 	System.out.println("Insira um número maior que 1: ");
	        int N = sc.nextInt();
	        
	        while(N <= 1) {
	        	System.out.println("Erro. Insira um número maior que 1: ");
		        N = sc.nextInt();
	        }
	        
	        System.out.println();
	        
	        
		    System.out.println("O quadrado dos pares até " + N + " é:");
		        
		    for (int i = 1; i <= N; i++) {
		       if (i % 2 == 0) {
		          int square = i * i;
		               
		          System.out.println(i + "^2 = " + square);
		        }
		    }
	        

	        sc.close();
	    }
	}
