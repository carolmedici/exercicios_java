package curso_programacao;
import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int i;
		for(i=1; i<=N; i++) {
			if(N%i==0) {
				System.out.println(i);
			}
		}
   		
		sc.close();
	}
}
	