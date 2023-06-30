package curso_programacao;

import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Scanner sc = new Scanner(System.in);
			
			int numero = sc.nextInt();
			int divisao = numero % 2;
			int resultado = 0;
			
			for(int i = 0; i<6; i++) {
				if(divisao != 0) {
					resultado = numero++;
					numero++;
					
				}else {
					numero++;
					resultado = numero ++;
					
									}
				System.out.println(resultado);
			}
			
			
			sc.close();
	}

}
