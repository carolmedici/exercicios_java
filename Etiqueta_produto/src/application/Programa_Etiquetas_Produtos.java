package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.Produto_Usado;

public class Programa_Etiquetas_Produtos {

	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
				
				if(tipoEtiqueta == 'i') {
					System.out.println("Taxa da Alfândega: ");
					double taxaAlfandega = sc.nextDouble();
					
					Produto pro = new ProdutoImportado(nome, preco, taxaAlfandega)	;								
					list.add(pro);
				} else if(tipoEtiqueta == 'u'){
					System.out.println("Data de Fabricação (DD/MM/YYYY): ");
					Date dataFabricacao = sdf.parse(sc.next());
					
					Produto pro = new Produto_Usado(nome, preco, dataFabricacao);
					list.add(pro);
				}else  {
					Produto pro = new Produto(nome, preco);
					list.add(pro);
				}
			}
			
			System.out.println();
			System.out.println("Etiquetas de preço:");
			for (Produto pro : list) {
				System.out.println( pro.precoEtiqueta());
			}
			
			
			
		sc.close();
	}
	
}