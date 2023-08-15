package curso_programacao;

import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
      System.out.println("Teste de números primos");
      System.out.println();
     System.out.println("Digite um número limite");
       
    
     int n = sc.nextInt();
     
     for(int i = 0; i<=n; i++){
           boolean primo = true;
           for(int j = 2; j<i; j++){
               if(i % j ==0){
                   primo = false;
                   System.out.println(i + " nao é primo");
                   break;
               }
           }if(primo){
               System.out.println(i + " é primo");
               
               
           }
     }
     
    sc.close();
    }
 
}