package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
	       Scanner sc = new Scanner(System.in);
	      
	       		double salario = sc.nextDouble();
	       		double taxa8 = (salario - 2000.00) * 0.08;
	       		double taxa18 = (salario - 3000.00) * 0.18;
	       		double taxa28 = (salario - 4500.00) * 0.28;
	       		double intervalo8 = 999.99 * 0.08; 
	       		double intervalo18 = 1499.99 * 0.18;        		
	       		
	       		double imposto;
	       		
	       		if(salario < 2000) {
	       			System.out.println("Isento");
	       		}
	       		else if(salario < 3000) {
	       			imposto = taxa8;
	       			System.out.printf("R$ %.2f%n", imposto);       				
	       		}
	       		else if(salario < 4500) {
	       			imposto = intervalo8 + taxa18;
	       			System.out.printf("R$ %.2f%n", imposto);       				
	       		}
	       		else {
	       			imposto = intervalo8 + intervalo18 + taxa28;
	       			System.out.printf("R$ %.2f%n", imposto);       				
	       		}
	       		       		       		
	       	sc.close();
	}

}
