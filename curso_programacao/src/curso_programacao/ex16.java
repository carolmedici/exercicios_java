package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			
			if(B>C && D>A && C+D>A+B && C>0 && D>0 && A%2==0) {
				System.out.println("Valores aceitos");
			}
			else {
				System.out.println("Valores nao aceitos");
			}
		sc.close();
		
	}

}
