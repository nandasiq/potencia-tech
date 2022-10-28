package desafios1;
import java.util.Scanner;

public class SomanadoMultiplos {
	public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int soma = 0;
        int i = 1;
        int multiplo = 0;
            
          do {
              multiplo = A * i;
              soma = soma + multiplo;
              i++;
              
          } while (multiplo < N);
            
          System.out.print(soma);
          input.close();
    }
}
