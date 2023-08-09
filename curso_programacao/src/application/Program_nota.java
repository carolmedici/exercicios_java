package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program_nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Aluno aluno = new Aluno();
		System.out.println("Insira o nome do aluno:");
		aluno.name = sc.next();
		aluno.surname = sc.nextLine();
		System.out.println("Insira as notas:");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		

		System.out.printf("Nota final = %.2f%n", aluno.media());
		
			
		if(aluno.media() >= 60.00) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
			System.out.printf("Faltou: %.2f ponto(s) %n", aluno.recuperacao());
		}
		
		sc.close();
	}

}