package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
	      
	       int tempo = sc.nextInt();
	       int velocidade = sc.nextInt();
	       
	       double distancia = tempo * velocidade;
	       double litro = distancia / 12;
	       
	       System.out.printf("%.3f%n", litro);
		
		sc.close();
		
		
	}

}
