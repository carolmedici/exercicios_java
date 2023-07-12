package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados?");
		int n = sc.nextInt();
		double [] vect = new double[n];
		String valores = "" ;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número:");
			vect[i]= sc.nextDouble(); 
			valores += vect[i] + " ";
			
		}
		System.out.println("Valores = " + valores);
	
		
		
		double soma = 0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		double media = soma / vect.length;
		
		System.out.println("Soma = " + soma);
		System.out.printf("Media = %.2f%n", media);
		
		sc.close();
	}

	

}
