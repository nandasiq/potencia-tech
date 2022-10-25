import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {

        /*
         * Com SWITCH use String para exibir um inteiro correspondente ao
         * dia da semana. No segundo exemplo, receba um int e verifique se
         * esta entre 1 - 3, se for imprima "Certo"; se for 4 "Errado";
         * se for 5 "talvez e default "Valor indefinido
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 7");
        int numSemana = entrada.nextInt();

        switch (numSemana) {
            case 1: {
                System.out.println("Domingo");
            } break;
            case 2: {
                System.out.println("Seguda");
            } break;
            case 3: {
                System.out.println("Terca");
            } break;
            case 4: {
                System.out.println("Quarta");
            } break;  
            case 5: {
                System.out.println("Quinta");
            } break;
            case 6: {
                System.out.println("Sexta");
            } break;
            case 7: {
                System.out.println("Sabado");
            } break;
            default: {
                System.out.print("Data for de padrao");
            }
        }

        System.out.println("\nDigite um numero aleatorio");
        int numAdivinha = entrada.nextInt();

        switch (numAdivinha) {
            case 1:
            case 2:
            case 3 :{
                System.out.println("Certo");
            } break;
            case 4: {
                System.out.println("Errado");
            } break;
            case 5: {
                System.out.println("Talvez");
            } break;
            default: {
                System.out.println("Valor indefinido");
            }
        }

        /*
         * Com o IF, receba um numero exiba o nome do mes do ano de acordo
         * com seu numero. Evite o efeito flecha. Faca tambem outro IF
         * que se for julho, dezembro ou janeiro, imprima "Ferias" na tela
         */

        int numMes;
        System.out.println("\nDigite um numero entre 1 e 12");
        numMes = entrada.nextInt();

        if (numMes == 1) {
            System.out.println("Janeiro");
        } else if (numMes == 2) {
            System.out.println("Fevereiro");
        } else if (numMes == 3) {
            System.out.println("Marco");
        } else if (numMes == 4) {
            System.out.println("Abril");
        } else if (numMes == 5) {
            System.out.println("Maio");
        } else if (numMes == 6) {
            System.out.println("Junho");
        } else if (numMes == 7) {
            System.out.println("Julho");
        } else if (numMes == 8) {
            System.out.println("Agosto");
        } else if (numMes == 9) {
            System.out.println("Setembro");
        } else if (numMes == 10) {
            System.out.println("Outubro");
        } else if (numMes == 11) {
            System.out.println("Novemrbo");
        } else if (numMes == 12) {
            System.out.println("Dezembro");
        }

        if (numMes == 1 || numMes == 7 || numMes == 12) {
            System.out.println("Ferias");
        }

        entrada.close();

    }

}
