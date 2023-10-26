package curso_programacao;

import java.util.Scanner;

public class ex61 {

	public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
            System.out.printf("%d %d %d%n", i, quadrado + 1, cubo + 1);
        }
        
        sc.close();
    }
}
