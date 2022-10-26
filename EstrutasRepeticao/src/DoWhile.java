import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        /*
         * Maior e Média: Faça um programa que leia 5 números e
         * informe o maior número e a média desses números.
         */
        Scanner entrada = new Scanner(System.in);

        int[] n = new int[5];
        int i = 0;
        int media = 0;

        do {
            System.out.println("Digite cinco numeros: ");
            n[i] = entrada.nextInt();
            i++;
        } while (i < 5);
        System.out.println("o maior numero e: "
        + Math.max(n[4],
                Math.max(n[3],
                        Math.max(n[2],
                                Math.max(n[1], n[0])))));

        do {
            media += n[i - 1];
            i--;
        } while (i != 0);

        System.out.println("A media dos numeros e: " + media / n.length);


        /*
         * Par e Ímpar: Faça um programa que peça N números inteiros.
         * Calcule e mostre a quantidade de números pares
         * e a quantidade de números impares.
         */

         System.out.println("Digite o tamanho da lista: ");
         int tamanho = entrada.nextInt();
         int tamanhoCopia = tamanho;

         int [] grupo = new int[tamanho];
         int par = 0;
         int impar = 0;
         int contador = 0;

         do{
            System.out.print("Digite um numero: ");
            grupo[tamanhoCopia - 1] = entrada.nextInt();
            tamanhoCopia --;
         } while (tamanhoCopia > 0);

         do {
            if (grupo[contador] % 2 == 0){
                par ++;
            } else {
                impar++;
            }
            contador++;
         } while (contador < tamanho);
         System.out.printf("Temos %d numeros pares e %d impares.", par, impar);


        entrada.close();
    }

}
