package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int i;
		
		for(i=1; i<=N; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			System.out.print(i);
			System.out.print(" " + quadrado);
			System.out.println(" " + cubo);
			
			
		}
   		
		sc.close();
	}
}