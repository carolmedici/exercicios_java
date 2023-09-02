package curso_programacao;

import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int maior = Math.max(x, y);
		int menor = Math.min(x, y)+1;
				
		for(int i = menor; i < maior ; i++) {
			if(i % 5 == 2 || i % 5 == 3 ) {
				if(i>0) {
				System.out.println(i);
				}
			}
		}
				
		sc.close();
	}
}
