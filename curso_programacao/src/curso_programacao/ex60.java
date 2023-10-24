package curso_programacao;

import java.util.Scanner;

public class ex60 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();

	        for (int i = 1; i <= N; i++) {
	            if (i % 2 == 0) {
	                int square = i * i;
	                System.out.println(i + "^2 = " + square);
	            }
	        }

	        sc.close();
	    }
	}
