package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa_abaixo_media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números terão no vetor?");
		int n = sc.nextInt();
		double soma = 0;
		double abaixo = 0;
		double media = 0;
		
		double[] vetor = new double[n];
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número:");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
			
					
		}
		media = soma / n;
		
		System.out.printf("Média do vetor: %.3f%n", media);
		
		
		System.out.println("Elementos abaixo da média:");
		
		for(int i = 0; i<n; i++) {

			 if(vetor[i]<media) {
					abaixo = vetor[i];
					System.out.println(abaixo);
				}
		}
	
			
		
		
		sc.close();

	}

}
