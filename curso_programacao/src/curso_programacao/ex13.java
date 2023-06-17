package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Locale.setDefault(Locale.US);
	       Scanner sc = new Scanner(System.in);
	      
	       	double x1 = sc.nextDouble();
	       	double y1 = sc.nextDouble();
	       	double x2 = sc.nextDouble();
	       	double y2 = sc.nextDouble();
	       	
	       	double eixoX = Math.pow((x2 - x1),2);
	       	double eixoY = Math.pow((y2 - y1), 2);
	       	double distancia = Math.sqrt(eixoX + eixoY);
	       	
	       	System.out.printf("%.4f%n", distancia);
	       	
	       	sc.close();
	}
}
