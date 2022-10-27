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

        /*
         * Consoantes: Faça um Programa que leia um vetor de 6 caracteres,
         * e diga quantas consoantes foram lidas. Imprima as consoantes.
         */
        String palavra;
        System.out.println("Digite um conjunto de seis letras");
        do {
            palavra = entrada.next();
            palavra = palavra.toLowerCase();
        } while (palavra.length() != 6);
        
        int consoante = 0;
        char [] car = new char[6];
        i++;
        for (; i < palavra.length(); i++){
            car[i] = palavra.charAt(i);
            if (car[i] > 97 && car[i] < 122) {
                if (car[i] != 101 && car[i] != 105 && car[i]  != 111 && car[i] != 117){
                    consoante++;
                    System.out.println(car[i]);
                }
                
            }
        } 
        System.out.println("Total consoantes: " + consoante);

        entrada.close();
    }
}