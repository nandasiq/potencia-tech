import java.util.Scanner;

public class ArrayMulti {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
         * Array Multidimensional: Gere e imprima uma matriz
         * M 4x4 com valores aleatórios entre 0-9. Após isso determine
         * o menor número da matriz e a sua posição(linha, coluna).
         */

         int [][] matriz = new int [2][2];
         int maior = 0;
         int linha = 0;
         int coluna = 0;

         for (int i = 0; i < 2; i++){
            for (int j = 0 ; j < 2; j++){
                do {
                    System.out.println("Digite um numero entre 0-9: ");
                    matriz[i][j] = entrada.nextInt();
                } while (matriz[i][j] <= 0 || matriz[i][j] > 10);
                if (maior < matriz[i][j]) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
         }
         
         System.out.printf("O maior numero e %d. Esta na linha %d e coluna %d.", maior, linha, coluna);

        entrada.close();
    }
}
