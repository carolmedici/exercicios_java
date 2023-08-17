package aplicacao;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada");

        System.out.println("Digite o número");
        int xLinha = sc.nextInt();
        int xColuna = 3;
        int[][] tabuada = new int[xLinha][xColuna];

        int numero = 1;
        int coeficiente = 1;

        for (int linha = 0; linha < xLinha; linha++) {
        	 System.out.println();
             System.out.println("Tabuada do " + numero);
        	for(int j = 0; j<10; j++) {
            tabuada[linha][0] = numero;
            tabuada[linha][1] = coeficiente;
            tabuada[linha][2] = numero * coeficiente;
            coeficiente++;
           
            System.out.println(tabuada[linha][0] + " * " + tabuada[linha][1] + " = " + tabuada[linha][2]);
        	
        	}
        	coeficiente=1;
            numero++;
        }

        
        sc.close();
    }
}
