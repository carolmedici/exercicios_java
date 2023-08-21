package curso_programacao;

import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	int par = 0;
	System.out.println("Digite 5 números");
	for(int i=0; i<5; i++) {
		int n = sc.nextInt();
		if(n % 2 ==0) {
			par++;
		}
	}System.out.println(par + " valores pares");
	
	sc.close();
	}

}
