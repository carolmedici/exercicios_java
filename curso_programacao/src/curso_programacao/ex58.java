package curso_programacao;
import java.util.Scanner;

public class ex58 {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        double valor = sc.nextDouble();
		        int valorCentavos = (int) (valor * 100);

		        int[] notasMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
		        String[] nomes = {"100.00", "50.00", "20.00", "10.00", "5.00", "2.00", "1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};

		        System.out.println("NOTAS:");
		        for (int i = 0; i < 6; i++) {
		            int quantidade = valorCentavos / notasMoedas[i];
		            valorCentavos %= notasMoedas[i];
		            System.out.printf("%d nota(s) de R$ %s\n", quantidade, nomes[i]);
		        }

		        System.out.println("MOEDAS:");
		        for (int i = 6; i < 12; i++) {
		            int quantidade = valorCentavos / notasMoedas[i];
		            valorCentavos %= notasMoedas[i];
		            System.out.printf("%d moeda(s) de R$ %s\n", quantidade, nomes[i]);
		        }
		        
		        sc.close();
		    }
		}
