import java.util.Scanner;

public class ControleFluxo {
    
/*
 * Com o IF, receba um numero exiba o nome do mes do ano de acordo 
 * com seu numero. Evite o efeito flecha. Faca tambem outro IF 
 * que se for julho, dezembro ou janeiro, imprima "Ferias" na tela
 */

 /*
  * Com SWITCH use String para exibir um inteiro correspondente ao
  * dia da semana. No segundo exemplo, receba um int e verifique se
  * esta entre 1 - 3, se for imprima "Certo"; se for 4 "Errado";
  * se for 5 "talvez e default "Valor indefinido
  */

  public static void main(String[] args) {

    
    Scanner entrada = new Scanner(System.in);
    
    int n1;
    System.out.println("Digite um numero entre 1 e 12");
    n1 = entrada.nextInt();

    if(n1 == 1){
        System.out.println("Janeiro");
    } else if (n1 == 2){
        System.out.println("Fevereiro");
    }


    entrada.close();

    
  }

}
