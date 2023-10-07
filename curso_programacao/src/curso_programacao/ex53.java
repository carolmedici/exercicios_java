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
			
			String primeiraLetra = (nome.substring(0,1)).trim();			
			primeiraLetraArray.add(primeiraLetra);
			
			String ultimaLetraPalavra = nome.trim() ;				
			int tamanho = ultimaLetraPalavra.length();			
			String ultimaLetra = ultimaLetraPalavra.substring(tamanho - 1);
			ultimaLetraArray.add(ultimaLetra);
			
			nome = (nome.substring(0, 14)).trim();
			nomeArray.add(nome);
			
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
}
