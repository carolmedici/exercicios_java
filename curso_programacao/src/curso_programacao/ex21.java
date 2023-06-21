package curso_programacao;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int i;
			int in = 0;
			int out = 0;
			
			for(i=0; i<N; i++) {
				int X = sc.nextInt();
				if(X >=10 && X<=20) {
					in++;
				}else {
					out++;
				}
			}
			
			System.out.println(in + " in");
			System.out.println(out + " out");
			
			
			
			sc.close();
	}

}
