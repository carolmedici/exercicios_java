package curso_programacao;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		int cedula100 = valor / 100;
		int resto100 = valor % 100;
		
		int cedula50 = resto100 / 50;
		int resto50 = resto100 % 50;
		
		int cedula20 = resto50 / 20;
		int resto20 = resto50 % 20;
		
		int cedula10 = resto20 / 10;
		int resto10 = resto20 % 10;
		
		int cedula5 = resto10 / 5;
		int resto5 = resto10 % 5;
		
		int cedula2 = resto5 / 2;
		int resto2 = resto5 % 2;		
		
		System.out.println(valor);
		System.out.println(cedula100 + " nota(s) de R$ 100,00");
		System.out.println(cedula50 + " nota(s) de R$ 50,00");
		System.out.println(cedula20 + " nota(s) de R$ 20,00");
		System.out.println(cedula10 + " nota(s) de R$ 10,00");
		System.out.println(cedula5 + " nota(s) de R$ 5,00");
		System.out.println(cedula2 + " nota(s) de R$ 2,00");
		System.out.println(resto2 + " nota(s) de R$ 1,00");
 		
				
		sc.close();

	}

}
