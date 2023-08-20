package aplicacao;

import java.util.Arrays;
import java.util.Scanner;

public class arrayPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Números primos do 0 até o limite");
		System.out.println("Digite o número limite");
		int n = sc.nextInt();

		int nPrimos = 0;
		boolean primo = true;
		for(int i=0; i<=n; i++) {
			primo = true;
			for(int j =2; j<i; j++) {
				if(i % j ==0) {
					primo = false;
					break;
				}
			}if(primo) {
				nPrimos++;			
			
			}
		}
		
		
		 
	     		
		int index = 0;
		int[] primos = new int[nPrimos];
		
		for(int i=0; i<=n; i++) {
			primos[index] =i;
			primo = true;
			for(int j =2; j<i; j++) {
				if(i % j ==0) {
					primo = false;
					
					break;
				}
			}	if(primo) {
				primos[index] =i;		
				index++;
				
			}
		}
		System.out.println(Arrays.toString(primos));
		
		sc.close();
	}

}
