package curso_programacao;

import java.util.Scanner;

public class ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
			int N = sc.nextInt();
			
			int numero = 1;
			
			for(int i=0; i<N; i++) {
				
					for(int x=0; x<3; x++) {
						System.out.print(numero + " " );
						numero = numero + 1;
					}
					numero = numero + 1;
					System.out.println("PUM");
				
			}
		
		sc.close();
	}

}
