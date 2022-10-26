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

        entrada.close();
    }

}
