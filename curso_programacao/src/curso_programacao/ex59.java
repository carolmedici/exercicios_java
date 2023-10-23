package curso_programacao;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class ex59 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        double[] lados = new double[3];
		        for (int i = 0; i < 3; i++) {
		            try {
		                lados[i] = sc.nextDouble();
		            } catch (InputMismatchException e) {
		                System.out.println("Erro: Insira um número" );
		                sc.close();
		                return;
		            }
		        }

		        Arrays.sort(lados);

		        double A = lados[2];
		        double B = lados[1];
		        double C = lados[0];

		        if (A >= B + C) {
		            System.out.println("NAO FORMA TRIANGULO");
		        } else {
		            if (A * A == B * B + C * C) {
		                System.out.println("TRIANGULO RETANGULO");
		            }
		            if (A * A > B * B + C * C) {
		                System.out.println("TRIANGULO OBTUSANGULO");
		            }
		            if (A * A < B * B + C * C) {
		                System.out.println("TRIANGULO ACUTANGULO");
		            }
		            if (A == B && B == C) {
		                System.out.println("TRIANGULO EQUILATERO");
		            } else if (A == B || B == C || A == C) {
		                System.out.println("TRIANGULO ISOSCELES");
		            }
		        }
		        sc.close();
		    }
		}
