import java.util.Scanner;

public class BuscaSequencial {
	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        int busca = leitor.nextInt();
        int posicao = buscar(busca, elementos);
            
        if (posicao == -1) {
            System.out.printf("Numero %d nao encontrado!", busca);
        } else {
            System.out.printf("Achei %d na posicao %d", busca, posicao);
        }
                      
        leitor.close();
      }
        
    public static int buscar(int busca, int elementos[]) {
        int posicao = -1;
        for(int i = 0; i < elementos.length; i++) {
            
            if (elementos[i] == busca) {
                posicao = i;
            }
        }
        return posicao;
    }

}
