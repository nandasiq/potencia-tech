import java.util.Scanner;

public class While {
    public static void main(String[] args) throws Exception {
        /*
         * Nome e Idade: Faça um programa que leia conjuntos de dois valores,
         * o primeiro representando o nome do aluno e o segundo representando
         * a sua idade. (Pare o programa inserindo o valor 0 no campo nome)
         */
        Scanner entrada = new Scanner(System.in);
        String nome = "a";
        int idade;

        while (!nome.equals("0")) {

            System.out.println("Digite seu nome e sua idade: ");
            nome = entrada.next();
            idade = entrada.nextInt();
        }
        /*
         * Nota: Faça um programa que peça uma nota, entre zero e dez.
         * Mostre uma mensagem caso o valor seja inválido e continue
         * pedindo até que o usuário informe um valor válido.
         */
        int nota;
        System.out.println("Digite um numero entre 0 e 10: ");
        nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.println("Valor invalido, digite novamente:");
            nota = entrada.nextInt();
        }

        entrada.close();
    }
}
