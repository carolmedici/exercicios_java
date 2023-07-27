package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double reajuste;

		
		double salario = sc.nextDouble();
		
		if(salario <= 400 && salario >0 ){
			reajuste = salario * 0.15;
			salario = salario + salario * 0.15;
					
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 15%");
			
		}else if (salario <=800 ){
			reajuste = salario * 0.12;
			salario = salario + salario * 0.12;
					
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 12%");
			
		}else if (salario <=1200 ){
			reajuste = salario * 0.10;
			salario = salario + salario * 0.10;
					
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 10%");
			
		}else if (salario <=2000 ){
			reajuste = salario * 0.07;
			salario = salario + salario * 0.07;
					
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 7%");
		}else {
			reajuste = salario * 0.04;
			salario = salario + salario * 0.04;
					
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", reajuste);
			System.out.println("Em percentual: 4%");
		}
			
		
		
		sc.close();
	}

}
