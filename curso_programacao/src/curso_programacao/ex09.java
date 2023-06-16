package curso_programacao;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int segundos = sc.nextInt();
		int minutos = segundos / 60;
		int relogioHora = minutos / 60;

		int relogioSegundo = segundos % 60;
		int relogioMinuto = minutos % 60;

		System.out.print(relogioHora + ":");
		System.out.print(relogioMinuto + ":");
		System.out.println(relogioSegundo);

		sc.close();
	}

}
