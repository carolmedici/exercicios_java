package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int i;
		int positivo=0;
		double total =0;
		
		for(i=1; i<=6;i++) {
			double num = sc.nextDouble();
			
			if(num > 0) {
				positivo++;
				total = total+num;
			}
			
			 
		}
		
		double media = total/positivo;
		
		
		System.out.println(positivo + " valores positivos");
		System.out.printf("%.1f%n", media);
		
		sc.close();
	}

}
