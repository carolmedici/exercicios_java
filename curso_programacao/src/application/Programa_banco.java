package application;

import java.util.Locale;
import java.util.Scanner;
import util.ContaBancaria;

public class Programa_banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
			
			System.out.println("Insira o nome do titular");
			String nome = sc.next();
			String sobrenome = sc.nextLine();

			System.out.println("Insira o número da conta");
			int conta = sc.nextInt();
			double saldo = 0.00;
			

			System.out.println("Existe um valor inicial? (s/n)");
			String inicial = sc.next();
			if(inicial.equals("s")) {
				System.out.println("Insira o valor inicial:");
				saldo = sc.nextDouble();
			}
		
			ContaBancaria contaBancaria = new ContaBancaria(nome, sobrenome, conta, saldo); 
			
			
			System.out.println(contaBancaria );
			
			System.out.println("Insira o valor do depósito: ");
			saldo = sc.nextDouble();
			contaBancaria.depositaDinheiro(saldo);
			System.out.println("Dados da conta atualizados: ");
			System.out.println(contaBancaria );
			
			System.out.println("Insira o valor do saque: ");
			saldo = sc.nextDouble();
			contaBancaria.sacaDinheiro(saldo);
			System.out.println("Dados da conta atualizados: ");
			System.out.println(contaBancaria );
		
		sc.close();
					
	}

}