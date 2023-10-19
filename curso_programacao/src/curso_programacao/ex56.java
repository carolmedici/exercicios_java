package curso_programacao;

import java.util.Scanner;

public class ex56 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		while (true) {
		System.out.println("Digite um numero X");
		int x = sc.nextInt();
		
		System.out.println("Digite um numero Y");
		int y = sc.nextInt();
		
		if(x <= 0 || y <= 0 ) {
			break;
		}
		
        int menor = Math.min(x, y);
        int maior = Math.max(x, y);
		
		for(; menor <= maior; menor++) {
			System.out.print(menor + " ");
			soma += menor;
		}System.out.println("Soma = " + soma);
		
		}
		sc.close();
	}

}
