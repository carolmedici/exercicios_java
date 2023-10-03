package Frutas;

import java.util.Locale;

public class App {

	  public static class Main {
        public static void main(String[] args) {
        	
        	Locale.setDefault(Locale.US);
        	
            String dadosDaString = "Goiaba,vermelha, 5.99";
            Fruta fruta1 = Fruta.novaFruta(dadosDaString);

            System.out.println("Nome: " + fruta1.getNome());
            System.out.println("Cor: " + fruta1.getCor());
            System.out.println("Preço: " + fruta1.getPreco());
            System.out.println("Diponibilidade: " + disponibilidade.DISPONIVEL);
            
            System.out.println();
        	
            dadosDaString = "Pêssego,amarelo, 12.99";
           Fruta fruta2 = Fruta.novaFruta(dadosDaString);

            System.out.println("Nome: " + fruta2.getNome());
            System.out.println("Cor: " + fruta2.getCor());
            System.out.println("Preço: " + fruta2.getPreco());
            System.out.println("Diponibilidade: " + disponibilidade.INDISPONÍVEL);
            
            
        }
    }

}
