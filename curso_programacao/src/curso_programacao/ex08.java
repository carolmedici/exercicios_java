package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
       int NUMERO = sc.nextInt();
       
       if (NUMERO % 2 == 0) {
     	  System.out.println("PAR");
       }
       else {
     	  System.out.println("IMPAR");
       }
              

     sc.close();
     
		
	}

}
