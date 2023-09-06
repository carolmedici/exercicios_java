package curso_programacao;

import java.util.ArrayList;
import java.util.Scanner;

public class ex40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 1.50;

        ArrayList<String> listaProdutos = new ArrayList<String>();

        for (int i = 1001; i <= 1005; i++) {
            listaProdutos.add(i + " | R$ " + preco);
            preco += 1;
        }

        System.out.println("Informe a quantidade de itens:");

        int pedidos = sc.nextInt();

        double totalPedido = 0; // Variável para rastrear o preço total dos pedidos

        for (int j = 0; j < pedidos; j++) {
            System.out.println("Qual o número do produto?");
            int numeroProduto = sc.nextInt();

            if (numeroProduto >= 1001 && numeroProduto <= 1005) {
                System.out.println("Qual a quantidade dele?");
                int quantidadeProduto = sc.nextInt();

                // Obtenha o preço do produto a partir da lista de produtos
                String produto = listaProdutos.get(numeroProduto - 1001);
                String[] parts = produto.split(" \\| R\\$ ");
                double precoLista = Double.parseDouble(parts[1]);

                double totalPrecoProduto = precoLista * quantidadeProduto;
                totalPedido += totalPrecoProduto; // Adicionar ao preço total dos pedidos

                System.out.println("Produto: " + produto);
                System.out.println("Quantidade: " + quantidadeProduto);
                System.out.println("Total parcial para este produto: R$ " + totalPrecoProduto);
            } else {
                System.out.println("Número de produto inválido.");
            }
        }

        System.out.println("Total do pedido: R$ " + totalPedido);

        sc.close();
    }
}
