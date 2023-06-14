package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Locale.setDefault(Locale.US);
				
				Scanner sc = new Scanner(System.in);
				
				double entrada = sc.nextDouble();
				double area = 3.14159 * Math.pow(entrada, 2);
			
				System.out.printf("A = %.4f%n", area );
						
						sc.close();
				
				
		}
		}
