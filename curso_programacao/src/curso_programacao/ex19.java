package curso_programacao;

import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String coluna = entrada.next();
        String classe = entrada.next();
        String alimentacao = entrada.next();

        if (coluna.equals("vertebrado")) {
            if (classe.equals("ave")) {
                if (alimentacao.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (alimentacao.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (classe.equals("mamifero")) {
                if (alimentacao.equals("onivoro")) {
                    System.out.println("homem");
                } else if (alimentacao.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (coluna.equals("invertebrado")) {
            if (classe.equals("inseto")) {
                if (alimentacao.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (alimentacao.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (classe.equals("anelideo")) {
                if (alimentacao.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (alimentacao.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
        
        entrada.close();
    }
}
