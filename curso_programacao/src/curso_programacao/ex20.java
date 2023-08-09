package curso_programacao;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int i;
		
		
		for(i=0; i <= valor; i++) {
			if ( (i % 2) != 0) {
			
			System.out.println(i);
		}
			
		sc.close();
			
	}}

}
