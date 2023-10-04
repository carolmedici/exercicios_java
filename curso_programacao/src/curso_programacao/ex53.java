package curso_programacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex53 {

	public static void main(String[] args) {		
		
		List<String> nomeCompleto = Arrays.asList("Hermione       Granger        ", "Naruto         Uzumaki        ", "Alphonso       Elric          ", "Bob            Esponja         ", "Monkey         D. Luffy       ");
		
		List<String> sobrenomeArray = new ArrayList<>();
		int index = 0;
		
		for(String parte : nomeCompleto) {
			
			String nome = nomeCompleto.get(index);
			String sobrenome = (nome.substring(15, 30)).trim();
			sobrenomeArray.add(sobrenome);
			index++;			
		}		
		System.out.println((sobrenomeArray));
	}	
}
