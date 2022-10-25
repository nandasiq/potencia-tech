public class OperadoresRelacionais {
    public static void main(String[] args) {
        // operadores < > == !=
        int n1 = 5;
        int n2 = 3;

        String simNao = n1 > n2 ? "sim" : "nao";
        System.out.println("n1 e maior que n2: " + simNao);

        simNao = n1 < n2 ? "sim" : "nao";
        System.out.println("n1 e menor que n2: " + simNao);

        simNao = n1 >= n2 ? "sim" : "nao";
        System.out.println("n1 e maior ou igual que n2: " + simNao);

        simNao = n1 <= n2 ? "sim" : "nao";
        System.out.println("n1 e menor ou igual que n2: " + simNao);

        simNao = n1 == n2 ? "sim" : "nao";
        System.out.println("n1 e igual que n2: " + simNao);

        simNao = n1 != n2 ? "sim" : "nao";
        System.out.println("n1 e diferente que n2: " + simNao);

    }

}
