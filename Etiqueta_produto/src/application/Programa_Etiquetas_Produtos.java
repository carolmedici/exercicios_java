package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;

public class Programa_Etiquetas_Produtos {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
	
		
			System.out.println("Insira a quantidade de produtos:");
			int n = sc.nextInt();
			
			for(int i = 1; i<=n; i++) {
				System.out.println("Dados do produto #" + i);
				System.out.println("Comum, usado ou importado (c/u/i)?");
				char tipoEtiqueta = sc.next().charAt(0);
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Preço: ");
				Double preco = sc.nextDouble();
				
				if(tipoEtiqueta == i) {
					System.out.println("Taxa da Alfândega: ");
					double taxaAlfandega = sc.nextDouble();
														
					list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
				}else  {
					list.add(new Produto(nome, preco));
				}
			}
			
			System.out.println();
			System.out.println("Etiquetas de preço:");
			for (Produto pro : list) {
				System.out.println(pro.getNome() + " R$ " + String.format("%.2f", pro.getPreco()));
			}
			
			
			
		sc.close();
	}
	
}
