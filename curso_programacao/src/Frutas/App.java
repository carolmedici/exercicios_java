package Frutas;

import java.util.Locale;

public class App {

	  public static class Main {
        public static void main(String[] args) {
        	
        	Locale.setDefault(Locale.US);
        	
            String dadosDaString = "Goiaba,vermelha, 5.99";
            Fruta frutaLista = Fruta.novaFruta(dadosDaString);

            System.out.println("Nome: " + frutaLista.getNome());
            System.out.println("Cor: " + frutaLista.getCor());
            System.out.println("Preço: " + frutaLista.getPreco());
            System.out.println("Diponibilidade: " + disponibilidade.DISPONIVEL);
        }
    }

}
