package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i;
		
		for(i=0; i<N; i++) {
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			
			if(y==0) {
				System.out.println("divisao impossivel");
			}else {
				double divisao = x/y;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
	}

}
