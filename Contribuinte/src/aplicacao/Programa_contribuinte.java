package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;



public class Programa_contribuinte {
	
	public static void main(String[] args) {
		
		List<Pessoa> list = new ArrayList<>();
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de contribuintes:");
		int n = sc.nextInt();
		double imposto = 0;
		String nome ="";
		Double gastoSaude = 0.00;
		
		for (int i=1; i <=n; i++) {
			System.out.println("Dados do #" + i + " contribuinte");
			System.out.println("Indivivual ou empresarial (i/e)?");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if(c == 'i') {
				System.out.print("Gastos com saude: ");
				gastoSaude = sc.nextDouble();
				if(rendaAnual >= 20000 ) {
					imposto = 0.25;
				}else {
					imposto = 0.15;
				}
				Pessoa p = new PessoaFisica(nome, rendaAnual, imposto, gastoSaude);
				list.add(p);
				
								
			}else if(c == 'e') {
				System.out.print("Número de funcionários: ");
				int qtdFuncionarios = sc.nextInt();
				if(qtdFuncionarios >10) {
					imposto = 0.14;
				}else {
					imposto = 0.16;
				}
				Pessoa p = new PessoaJuridica(nome, rendaAnual, imposto);
				list.add(p);
			} 
			
		}
		System.out.println();
		System.out.println("Taxas pagas:");
		double taxas = 0;
		
		for (Pessoa p : list) {
			System.out.println();
			System.out.printf( p.contribuinte() );
			taxas += p.taxa();
		}
		
		
		System.out.println();
		System.out.println();
		System.out.printf("Total de taxas: %.2f%n", taxas);
		
		
		sc.close();
	}
	

}