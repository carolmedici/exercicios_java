package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i;
		
		int nFatorial = 1;
		
		
		for(i=1; i<=N; i++) {
		int fatorial = (N-i);
		if(fatorial==0) {
			fatorial=1;
		}
		nFatorial = nFatorial*fatorial;
			
		}
		
		if(N==0) {
			N=1;
		}
		int saida = N*nFatorial;
		
		System.out.println(saida);
				
   		
		sc.close();
	}
}
