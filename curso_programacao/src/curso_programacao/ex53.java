package curso_programacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex53 {

	public static void main(String[] args) {		
		
		List<String> nomeCompleto = Arrays.asList("Hermione       Granger        ", "Naruto         Uzumaki        ", "Alphonso       Elric          ", "Bob            Esponja         ", "Monkey         D. Luffy       ");
		
		List<String> sobrenomeArray = new ArrayList<>();
		List<String> nomeArray = new ArrayList<>();
		List<String> primeiraLetraArray = new ArrayList<>();
		List<String> ultimaLetraArray = new ArrayList<>();
		
		int index = 0;
		
		for(String parte : nomeCompleto) {
			
			String nome = nomeCompleto.get(index);
			String sobrenome = (nome.substring(15, 30)).trim();
			sobrenomeArray.add(sobrenome);
			index++;			
		}	
		
		index = 0;
		for(String parte : nomeCompleto) {
			String nome = nomeCompleto.get(index);
			nome = (nome.substring(0, 14)).trim();
			nomeArray.add(nome);
			index++;
		}
		

		index = 0;
		for(String parte : nomeCompleto) {
			String nome = nomeCompleto.get(index);
			String primeiraLetra = (nome.substring(0,1)).trim();
			
			primeiraLetraArray.add(primeiraLetra);
			index++;
		}
		
		index = 0;
		
		for(String parte : nomeCompleto) {
			String nome = nomeCompleto.get(index);
			String ultimaLetraPalavra = nome.trim() ;				
			int tamanho = ultimaLetraPalavra.length();			
			String ultimaLetra = ultimaLetraPalavra.substring(tamanho - 1);
			ultimaLetraArray.add(ultimaLetra);
			
			index++;
		}
		
		System.out.println((sobrenomeArray));
		System.out.println();
		System.out.println(nomeArray);
		System.out.println();
		System.out.println(primeiraLetraArray);
		System.out.println();
		System.out.println(ultimaLetraArray);
	}

	private static String lastIndexOf(String trim) {
		// TODO Auto-generated method stub
		return null;
	}	
}
