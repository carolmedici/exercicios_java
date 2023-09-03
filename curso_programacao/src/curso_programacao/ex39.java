package curso_programacao;

import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
	
		try {
			int numero = sc.nextInt();
			int soma = 0;
			for(int i = 1; i < numero; i++) {
				if(numero % i == 0) {
					soma += i;
					
				}
			}if(soma==numero) {
				System.out.println(numero + " é perfeito");
			}else {
				System.out.println(numero + " não é perfeito" );
			}
			
		}catch (Exception erro ){
			String mensagemErro = erro.getMessage();
			System.out.println("Erro:" + mensagemErro );;
		}
			
		sc.close();

	}

}
