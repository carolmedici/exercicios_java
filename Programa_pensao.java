import java.text.ParseException;
import java.util.Scanner;
import entities.Quartos;

public class Programa_pensao {

	
		public static void main(String[] args) throws ParseException {
			
			Scanner sc = new Scanner(System.in);
			
			Quartos[] quartoDisponivel = new Quartos[10];
			
			System.out.println("Quantos hóspedes serão cadastrados");
			int n = sc.nextInt();
				
											
				for(int i = 1; i <= n  ; i++) {
					
					System.out.println("Reserva #" + i + ":");
					System.out.print("Nome: ");
					String nome = sc.next();
					System.out.print("Email: ");
					String email = sc.next();
					System.out.printf("Room: ");
					int quarto = sc.nextInt();
					quartoDisponivel[quarto] = new Quartos(nome, email);				
					
				}	
					
				
					System.out.println("Quartos ocupados: ");
					
					for(int i = 0 ; i < 10; i++) {
						if(quartoDisponivel[i] != null) {
							System.out.println(i + ":" + quartoDisponivel[i]);
						}
				}
				
					
			sc.close();

	}
}