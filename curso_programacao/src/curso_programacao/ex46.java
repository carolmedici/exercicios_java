package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex46 {

	public static void main(String[] args) {
							
						Scanner sc = new Scanner(System.in);
						
						int index = 0;
						int quantidadePrimos = 0;
						
						System.out.println("Quantos números terão na lista?");
						int quantidade = sc.nextInt();
						
						List<Integer> lista = new ArrayList<>();
						
						System.out.println("Digite os números desejados");
						for(int i = 0; i < quantidade; i++) {
							
							int numero = sc.nextInt();
							
							lista.add(numero);
						}
						
						List <Integer> listaPrimos = new ArrayList<>();
						
						for(int j = 0; j < lista.size(); j++) {
							
							int testeNumero = lista.get(index);
							
							boolean primo = true;
							
							for(int x = 0; x < testeNumero; x++) {
								for( int y = 2; y < testeNumero; y++) {
									if(testeNumero % y == 0) {
										primo = false;
									}
								}
							}
							
							if(primo) {
								listaPrimos.add(testeNumero);
								quantidadePrimos ++;
								
							}
							index++;
						}
						
						System.out.println("Lista digitada: " + lista);
						System.out.println("Lista de números primos: " + listaPrimos);
						System.out.println("Quantidade de números primos: " + quantidadePrimos);
						
						sc.close();

					}

				}


