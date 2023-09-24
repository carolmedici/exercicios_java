package curso_programacao;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String cor;
    private String fruta;
    

    public Pessoa(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    
    public Pessoa(String nome, String cor, String fruta) {
		this.nome = nome;
		this.cor = cor;
		this.fruta = fruta;
	}


	public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String cor() {
        return cor;
    }

    @Override
    public String toString() {
       
        return "Nome: " 
        		+ nome 
        		+ ", Idade: " 
        		+ idade 
        		+ ", Cor: " 
        		+ cor;
    }
    

    public String pessoaPreferidos() {
    	
    	String nomeFormatado = nome.substring(0, Math.min(nome.length(), 15));
    	String corFormatado = nome.substring(0, Math.min(nome.length(), 8));
    	String frutaFormatado = nome.substring(0, Math.min(nome.length(), 10));
       
        return "Nome: " 
        		+ nomeFormatado 
        		+ ", cor: " 
        		+ corFormatado
        		+ ", fruta: "
        		+ frutaFormatado ;
        
    }

    public static void main(String[] args) {
        List<Pessoa> listaDePessoas = new ArrayList<>();

  
        listaDePessoas.add(new Pessoa("Carol", 34, "Azul"));
        listaDePessoas.add(new Pessoa("Greg", 38, "Verde"));
        listaDePessoas.add(new Pessoa("Tutis", 4, "Amarelo"));
        
            
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa.toString());
        }
                
  
        List<Pessoa> listaDePreferencias = new ArrayList<>();

  
        listaDePreferencias.add(new Pessoa("Carol", "Azul", "Morango"));
        listaDePreferencias.add(new Pessoa("Greg", "Verde", "Maçã"));
        listaDePreferencias.add(new Pessoa("Tutis", "Amarelo", "Melancia"));
        
        System.out.println();
            
        for (Pessoa pessoa1 : listaDePreferencias) {
            System.out.println(pessoa1.pessoaPreferidos());
      
     
           
        
    }
   	
   	
    
    }}
