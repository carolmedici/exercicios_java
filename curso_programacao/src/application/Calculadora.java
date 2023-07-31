package application;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		System.out.println();
		System.out.print("Digite o primeiro número:");
		double x = sc.nextDouble();
		System.out.print("Digite o segundo número:");
		double y = sc.nextDouble();
		System.out.println("Qual operação você deseja fazer?");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		int operacao = sc.nextInt();
		double resultado = 0;
		String nome = "";
		
		switch(operacao) {
		case 1:
			resultado = x + y;
			nome = "soma";
			break;
		case 2:
			resultado = x - y;
			nome = "subtração";
			break;
		case 3:
			resultado = x * y;
			nome = "multiplicação";
			break;
		case 4:
			resultado = x / y;
			nome = "divisão";
			break;
		}
		
		System.out.println("o resultado da " + nome + " entre " + x + " e " + y + " é: " + resultado);
		
		
		
		
		
		
		
		sc.close();
	}

}
