package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				
				Scanner sc = new Scanner(System.in);
				
				int A, B, C, D;
				
				A = sc.nextInt();
				B = sc.nextInt();
				C = sc.nextInt();
				D = sc.nextInt();

				int diferenca = (A*B)-(C*D);
				
				System.out.println("DIFERENÇA = " + diferenca);
				
						sc.close();
							
				
		}
		}