package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i;
		int totalCobaia = 0;
		int coelhos = 0;
		int sapos = 0 ;
		int ratos = 0;
		
		for(i=0; i<N; i++) {
			int quantia = sc.nextInt();
			char cobaia = sc.next().charAt(0);
			
			totalCobaia = totalCobaia + quantia;
			if(cobaia == 'C') {
				coelhos = coelhos + quantia;
			}else if (cobaia == 'S') {
				sapos = sapos + quantia;
			}else if (cobaia == 'R') {
				ratos = ratos + quantia;
			}}
		
			float percentualCoelhos = (float) 100 / totalCobaia * coelhos;
			float percentualRatos = (float) 100 / totalCobaia * ratos;
			float percentualSapos = (float) 100 / totalCobaia * sapos;
			
			System.out.println("Total: " + totalCobaia + " cobaias");
			System.out.println("Total de coelhos: " + coelhos);
			System.out.println("Total de ratos: " + ratos);
			System.out.println("Total de sapos: " + sapos);
			System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
			System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
			System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos );
			
		sc.close();
	}

}
