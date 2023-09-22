package curso_programacao;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String cor;

    public Pessoa(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
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
        		+ ", Sexo: " 
        		+ cor;
    }

    public static void main(String[] args) {
        List<Pessoa> listaDePessoas = new ArrayList<>();

  
        listaDePessoas.add(new Pessoa("Carol", 34, "Azul"));
        listaDePessoas.add(new Pessoa("Greg", 38, "Verde"));
        listaDePessoas.add(new Pessoa("Tutis", 4, "Amarelo"));
        
            
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa.toString());
        }
     
           
        
    }
   	
    
}
