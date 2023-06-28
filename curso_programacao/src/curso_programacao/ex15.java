package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		int senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();

		}
		System.out.println("Acesso Permitido");

		sc.close();
		
		
	}

}