package curso_programacao;

import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Digite quantos casos testes serão realizados");
		int n = sc.nextInt();
		int soma = 0;
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite os números do caso teste #" + (i+1));
			 x = sc.nextInt();
			y = sc.nextInt();
			
			int maior = 0;
			int menor = 0;
			
			if(x>y) {
				maior = x;
				menor = y;
			}else {
				maior=y;
				menor = x;
			}
			
			for(int j = menor + 1; j < maior; j++) {
				if (j % 2 != 0) {
					soma += j;
					
				}
			}System.out.println("A soma dos números ímpares entre " + x + " e " + y + " é igual a: " + soma);
			soma = 0;
			
		}
		
		
		sc.close();

	}

}
