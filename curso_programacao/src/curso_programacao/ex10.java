package curso_programacao;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int idadeEmDias = sc.nextInt();
		int idadeAno = idadeEmDias / 365;
		int restoAno = idadeEmDias % 365;
		int idadeMes = restoAno / 30;
		int idadeDia = restoAno % 30;
		
		System.out.println(idadeAno + " ano(s)");
		System.out.println(idadeMes + " mes(es)");
		System.out.println(idadeDia + " dia(s)");
		
		sc.close();
		
	}

}
