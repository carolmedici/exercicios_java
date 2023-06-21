package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i;
		
		for(i=0; i<N; i++) {
			double valor = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			double media = ((valor*2) + (valor2*3)+(valor3*5))/10;
			System.out.printf("%.1f%n", media);
		}
		
		
		sc.close();

	}

}
