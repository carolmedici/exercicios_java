package curso_programacao;
import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
	
		
				try (Scanner sc = new Scanner(System.in)) {
					int index = 0;
							
					System.out.println("Qual será o número de colunas?");
					int xColuna = sc.nextInt();
					
					System.out.println("Qual será o número de linhas?");
					int xLinha = sc.nextInt();
					
					String[][] tabela = new String[xLinha][xColuna]; 
					
					int linha = 0;
					
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
					int acheiLinha = 0;
					int acheiColuna = 0;
					int procuraColuna = 0;
					
					for(int procuraLinha = 0; procuraLinha < xLinha; procuraLinha++) {
						for(procuraColuna = 0; procuraColuna < xColuna; procuraColuna++) {
							if(tabela[procuraLinha][procuraColuna].equals(posicao)) {
								acheiColuna = procuraColuna;
								acheiLinha = procuraLinha;}
							}
						
					}
					
					System.out.println("O texto desejado está na posição: (" + acheiLinha + ", " + acheiColuna + ")");
					
					sc.close();
					
					
				}catch(Exception ArrayIndexOutOfBoundsException){
					System.out.println("Erro: " + ArrayIndexOutOfBoundsException.getMessage());
				}
				
			}

		}
