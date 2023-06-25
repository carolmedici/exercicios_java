package curso_programacao;

import java.util.Scanner;

public class ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i<=10; i++) {
			int calcular = i * N;
			System.out.println(i + " x " + N + " = " + calcular);
		}
		
		
		sc.close();

	}

}
