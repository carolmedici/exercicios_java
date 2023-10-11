package curso_programacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ex53 {

	public static void main(String[] args) {	
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		
		List<String> nomeCompleto = Arrays.asList("Hermione       Granger        10051989", "Naruto         Uzumaki        23122000", "Alphonso       Elric          18072007", "Bob            Esponja        15111996", "Monkey         D. Luffy       04122000");
		
		List<String> sobrenomeArray = new ArrayList<>();
		List<String> nomeArray = new ArrayList<>();
		List<String> primeiraLetraArray = new ArrayList<>();
		List<String> ultimaLetraArray = new ArrayList<>();
		List<String> idadeArray = new ArrayList<>();
		
		Boolean maioridade = false;
		
		String maiorIdade = "";
		String nome = "";
		String sobrenome = "";
		String idade = "";
	
		int index = 0;
		
		for(String parte : nomeCompleto) {
			
			nome = nomeCompleto.get(index);
			
			sobrenome = (nome.substring(15, 30)).trim();
			sobrenomeArray.add(sobrenome);
			
			String primeiraLetra = (nome.substring(0,1)).trim();			
			primeiraLetraArray.add(primeiraLetra);
			
			String ultimaLetraPalavra = nome.trim() ;				
			int tamanho = ultimaLetraPalavra.length();			
			String ultimaLetra = ultimaLetraPalavra.substring(tamanho - 1);
			ultimaLetraArray.add(ultimaLetra);
			
			nome = (nome.substring(0, 14)).trim();
			nomeArray.add(nome);
			
			 try {
	                Date dataNascimento = sdf.parse(parte.substring(30, 38));
	                LocalDate dataNasc = dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	                LocalDate dataAtual = LocalDate.now();
	                Period periodo = Period.between(dataNasc, dataAtual);
	                idade = String.valueOf(periodo.getYears()); 
	                idadeArray.add(idade);
	                
	                if(Integer.parseInt(idade) > 18) {
	                	
	                maioridade = true;
	                }else {
	                	maioridade = false;
	                }
	               
	            } catch (ParseException e) {
	                e.printStackTrace();
	            }
			 
					System.out.println(nome + " " + sobrenome + ", idade: " + idade + " anos. Maior de idade: " + maioridade );
					
			index++;				
		}			
		
		System.out.println();
		System.out.println((sobrenomeArray));
		System.out.println();
		System.out.println(nomeArray);
		System.out.println();
		System.out.println(primeiraLetraArray);
		System.out.println();
		System.out.println(ultimaLetraArray);
		System.out.println();
		System.out.print(nomeArray.get(0)+ " ");
		System.out.println(sobrenomeArray.get(4) );
		System.out.println();
		System.out.print(ultimaLetraArray.get(3) );
		System.out.print(primeiraLetraArray.get(3));
		System.out.println(ultimaLetraArray.get(2) );
		System.out.println();
		System.out.println(idadeArray);		
	}

	private static int parseInt(String idade) {
		// TODO Auto-generated method stub
		return 0;
	}		
}
