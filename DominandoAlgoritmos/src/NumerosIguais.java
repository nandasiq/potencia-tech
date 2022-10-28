
import java.util.Scanner;
public class NumerosIguais {



	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);
	        
	        int a = entrada.nextInt();
	        int b = entrada.nextInt();
	        
	        if (a == b){
	          System.out.println("Sao iguais!");
	        } else {
	          System.out.println("Nao sao iguais!");
	        }
	        
	        
	        entrada.close();

	    }
	}
