package curso_programacao;
import java.util.ArrayList;
import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
	
		int acheiLinha = 0;
		int acheiColuna = 0;
		int procuraColuna = 0;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual será o número de colunas?");
		int xColuna = sc.nextInt();
		
		System.out.println("Qual será o número de linhas?");
		int xLinha = sc.nextInt();
		
		String[][] tabela = new String[xLinha][xColuna]; 
		
		int indexArray = 0;
		String[] arrayPosicoes = new String[4];
		
		int linha = 0;
		
				try  {
					
					
					for(linha = 0; linha < xLinha; linha++ ) {
						System.out.println("Digite os textos da linha " + (linha+1));
					
						for(int coluna = 0; coluna < xColuna; coluna++) {
						
							String texto = sc.next();
							tabela[linha][coluna] = texto;
							
						}
								
						}	
					
					for(int i = 0; i <xLinha; i++) {
						for(int j = 0; j <xColuna; j++) {
						
						
						System.out.print(tabela[index][j] + " ");
					}
						
					System.out.println();
					index++;
					
		}
					System.out.println();
					
					System.out.println("Qual texto deseja analisar"); 
					
					String posicao = sc.next();
				
					
					for(int procuraLinha = 0; procuraLinha < xLinha; procuraLinha++) {
						for(procuraColuna = 0; procuraColuna < xColuna; procuraColuna++) {
							if(tabela[procuraLinha][procuraColuna].equals(posicao)) {
								acheiColuna = procuraColuna;
								acheiLinha = procuraLinha;
							}
						}
					}
					
					System.out.println("O texto desejado está na posição: (" + acheiLinha + ", " + acheiColuna + ")");
										
				}
				catch(Exception ArrayIndexOutOfBoundsException){
					System.out.println("Erro: " + ArrayIndexOutOfBoundsException.getMessage());
				}
				
				try {
					
					arrayPosicoes[0] = tabela[acheiLinha-1][acheiColuna];
					arrayPosicoes[1] = tabela[acheiLinha][acheiColuna+1];
					arrayPosicoes[2] = tabela[acheiLinha+1][acheiColuna];
					arrayPosicoes[3] = tabela[acheiLinha][acheiColuna-1];
						
					System.out.println("Acima está: " + arrayPosicoes[0]);
					System.out.println("À direita: " + arrayPosicoes[1]);
					System.out.println("Abaixo: " + arrayPosicoes[2]);
					System.out.println("À esquerda: " + arrayPosicoes[3]);
					
				
				}
				catch(Exception ArrayIndexOutOfBoundsException){
				System.out.println("Não é possível imprimir as posições adjacentes >> Fora do limite da matriz." );
				}
			
			sc.close();
			}

		}
