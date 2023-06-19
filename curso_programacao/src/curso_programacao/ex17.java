package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			
			double delta = Math.pow(B, 2) - (4*A*C);
			double xPositivo = (-B + Math.sqrt(delta))/(2*A);
			double xNegativo = (-B - Math.sqrt(delta))/(2*A);
			
			
			if(A==0 || delta <0) {
				System.out.println("Impossivel calcular");
			}else {
				System.out.printf("R1 = %.5f%n", xPositivo);
				System.out.printf("R2 = %.5f%n", xNegativo);
			}
		
		sc.close();
		
	}

}