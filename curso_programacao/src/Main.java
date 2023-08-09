import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

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
