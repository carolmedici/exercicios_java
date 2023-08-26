package aplicacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class textoDuplicado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas serão digitadas?");
		int quantidade = sc.nextInt();
		 sc.nextLine();
		
		ArrayList<String> lista = new ArrayList<>();
		System.out.println("Digite as frases separadas por linhas.");
		
		for(int i = 0; i < quantidade; i++) {
			String texto = sc.nextLine();
			lista.add(texto);
		}
		
		Set<String> duplicados = new HashSet<>();
		Set<String> textoVisto = new HashSet<>();
		
	        for (String frase : lista) {
	            if (textoVisto.contains(frase)) {
	                
	                duplicados.add(frase);
	            }else {
	            	textoVisto.add(frase);
	            }
	        }
		
	          
		System.out.println("A lista digitada foi: " + lista);
		System.out.println("Os textos duplicados são: " + duplicados);
		
		sc.close();
	}

}
