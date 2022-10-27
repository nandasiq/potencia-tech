import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
         * Ordem Inversa: Faça um Programa que leia um vetor
         * de 5 números inteiros e mostre-os na ordem inversa.
         */

        Scanner entrada = new Scanner(System.in);

        int [] vetor = new int[5];
        int i = 0;

        System.out.println("Digite cinco numeros: ");
        for (; i < vetor.length; i++){
            vetor[i] = entrada.nextInt();
        }
        for (i = i -1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
        entrada.close();
    }

}