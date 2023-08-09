package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Programa_retangulo {
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Retangulo x;
	x = new Retangulo();
	
	System.out.println("Insira a largura e altura do Retângulo:");
	x.width = sc.nextDouble();
	x.heigth = sc.nextDouble();
	
	
	double area = x.area();
	double perimeter = x.perimeter();
	double diagonal = x.diagonal();
	
	System.out.printf("AREA = %.2f%n", area);
	System.out.printf("PERÍMETRO = %.2f%n", perimeter);
	System.out.printf("DIAGONAL = %.2f%n", diagonal);
	
	
	sc.close();
		
		
		
	}

}