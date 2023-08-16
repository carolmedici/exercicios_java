package curso_programacao;

import java.util.Scanner;

public class ex36 {
	

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quantos números serão digitados?");
	int n = sc.nextInt();
	
	for(int i = 0; i < n; i++) {
		int numero = sc.nextInt();
		boolean primo = true;
		for(int j = 2; j<numero; j++) {
		if (numero % j ==0 ) {
			primo = false;
			System.out.println(numero + " nao é primo");
			break;
		}
		}if(primo) {
			System.out.println(numero + " é primo");
			
	}
		
	}
	sc.close();	
	}
	

}
