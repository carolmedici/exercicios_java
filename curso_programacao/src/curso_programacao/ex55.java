package curso_programacao;
import java.util.Scanner;

public class ex55 {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int A, N;

	        A = sc.nextInt();
	        N = sc.nextInt();

	        while (N <= 0) {
	            System.out.println("N deve ser positivo e diferente de zero. Digite um novo valor para N:");
	            N = sc.nextInt();
	        }

	        int soma = 0;
	        for (int i = 0; i < N; i++) {
	            soma += A + i;
	        }

	        System.out.println(soma);

	        sc.close();
	    }
	
}