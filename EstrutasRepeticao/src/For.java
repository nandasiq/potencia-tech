import java.util.Scanner;

public class For {
    
    public static void main(String[] args) {
        
        /*
         * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar 
         * a tabuada de qualquer número inteiro entre 1 a 10.
         * O usuário deve informar de qual numero ele deseja ver a tabuada. 
         * A saída deve ser conforme o exemplo abaixo:
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero para saber sua tabuada");
        int n = entrada.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.printf("%d X %d = %d\n", n, i, (n*i));
        }

        /*
         *  Faça um programa que calcule o fatorial de um número 
         * inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
         */

        System.out.println("Digite um numero, sera impresso seu fatorial.");
        int fatorial = entrada.nextInt();
        int valor = fatorial;

        for(int i = fatorial - 1; i > 0; i--){
            valor = valor * i;
        }
        System.out.println("Fatorial: " + valor);


        entrada.close();
    }
}
