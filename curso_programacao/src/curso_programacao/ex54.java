package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        boolean valorCerto = false;
        double valor = 0;

        while (!valorCerto) {
            System.out.println("Digite o valor com duas casas decimais (Ex: 4.00) ");
            System.out.println("Abaixo você verá o valor divido no menor número de notas e moedas possível:");
            System.out.println();
            try {
                valor = sc.nextDouble();
                valorCerto = true;
            } catch (Exception e) {
                System.out.println(">> Erro << Digite o número com '.' e não ','. (Ex: 4.00)");
                sc.nextLine(); 
            }
        }

        int[] notas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {1, 0.5, 0.25, 0.1, 0.05, 0.01};
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
