package curso_programacao;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Regras do Jogo");
		System.out.println("Escreva 5 números");
		System.out.println("O 1o indicará se o jogador 1 será par(1) ou ímpar(0).");
		System.out.println("O 2o equivale ao número do 1o jogador.");
		System.out.println("O 3o equivale ao número do 2o jogador.");
		System.out.println("O 4o indicará se o jogador 1 irá roubar (1) ou não(0) o jogo.");
		System.out.println("O 5o indicará se o jogador 2 irá acusar (1) ou não(0) o jogador 1 de roubo.");
		
		int p = sc.nextInt();
		int j1 = sc.nextInt();
		int j2 = sc.nextInt();
		int r = sc.nextInt();
		int a = sc.nextInt();
		int soma = j1+j2;
		
		
		 boolean jogador1Ganha = (p == 0)
	                ? ((r == 1 && a == 0) || (r == 0 && a == 1) || soma % 2 != 0)
	                : ((r == 1 && a == 0) || (r == 0 && a == 1) || soma % 2 == 0);
		 
		

	        String resultado = jogador1Ganha ? "Jogador 1 ganha!" : "Jogador 2 ganha!";
	        System.out.println(resultado);	
		
		sc.close();
	}

}
