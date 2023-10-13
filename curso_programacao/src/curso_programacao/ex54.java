package curso_programacao;
import java.util.Locale;
import java.util.Scanner; 

public class ex54 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		        
	        sc.useLocale(Locale.US);

	        System.out.print("Digite o valor com duas casas decimais: ");
	        double valor = sc.nextDouble();

	        int[] notas = { 100, 50, 20, 10, 5, 2 };
	        double[] moedas = { 1, 0.5, 0.25, 0.1, 0.05, 0.01 };
	        System.out.println();
	        System.out.println("NOTAS:");
	        for (int nota : notas) {
	            int quantidadeNotas = (int) (valor / nota);
	            valor %= nota;
	            
	            System.out.printf("%d nota(s) de R$ %.2f\n", quantidadeNotas, (double) nota);
	        }
	        System.out.println();
	        System.out.println("MOEDAS:");
	        for (double moeda : moedas) {
	            int quantidadeMoedas = (int) (valor / moeda);
	            valor %= moeda;
	            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, moeda);
	        }

	        sc.close();
	    }
	}
