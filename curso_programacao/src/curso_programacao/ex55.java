package curso_programacao;
import java.util.Scanner;

public class ex55 {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int A, N;
	        System.out.println("Digite um número 'A'");
	        A = sc.nextInt();
	        System.out.println("Digita o limite de números, 'N', consecutivos que serão somados ao 'A'");
	        N = sc.nextInt();

	        while (N <= 0) {
	            System.out.println("N deve ser positivo e diferente de zero. Digite um novo valor para N:");
	            N = sc.nextInt();
	        }

	        int soma = 0;
	        for (int i = 0; i < N; i++) {
	            soma += A + i;
	        }

	        System.out.println("A soma dos números consecutivos de A até N é de: " + soma);

	        sc.close();
	    }
	
}