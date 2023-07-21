 package application;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números serão digitados?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			vect[i] = sc.nextInt();
			
			}
		System.out.println("Números negativos");	
		int negativo;
		for( int i = 0; i<vect.length; i++) {
		if(vect[i]<0) {
			negativo = vect[i];
			System.out.println(negativo);
		}
		}
		
		
		
		
		sc.close();

	}

}