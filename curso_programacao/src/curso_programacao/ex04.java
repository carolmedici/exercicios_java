package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
			int numero = sc.nextInt();
			int horas = sc.nextInt();
			double salarioHora = sc.nextDouble();
			double salario = horas * salarioHora;
			
			System.out.println("NUMBER = " + numero);
			System.out.printf("SALARY = US$ %.2f%n", salario);
		
		
		
		sc.close();
		
	}

}
