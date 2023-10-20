package curso_programacao;
import java.util.Scanner;

public class ex57 {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);
		        
		        int idade;
		        int somaIdades = 0;
		        int totalIndividuos = 0;
		        System.out.print("Digite a(s) idade(s) desejadas ou um valor negativo para encerrar: ");
		           
		        while (true) {
		             idade = scanner.nextInt();
		            
		            if (idade < 0) {
		                break; 
		            }
		            
		            somaIdades += idade;
		            totalIndividuos++;
		        }
		        
		        if (totalIndividuos > 0) {
		            double mediaIdades = (double) somaIdades / totalIndividuos;
		            System.out.printf("A média de idades é: %.2f%n", mediaIdades);
		        } else {
		            System.out.println("Nenhum dado foi inserido para calcular a média :(");
		        }
		        
		        scanner.close();
		    }
		}
