package application;

import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class Programa_salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee();
			System.out.println("Entra com os dados do empregado: ");
			System.out.print("Nome: ");
			employee.name = sc.next();
			employee.surname = sc.next();
			System.out.print("Salário: ");
			employee.grossSalary = sc.nextDouble();
			System.out.println("Tax: ");
			employee.tax = sc.nextDouble();
			
			System.out.println();
			System.out.println("Funcionário: " + employee);
			
			System.out.println();
			System.out.println("Qual a porcentagem para aumentar o salário?");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
			
			System.out.println();
			System.out.println("Dados atualizados: " + employee);
	    
		
		
		sc.close();
	}

}