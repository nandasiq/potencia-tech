package Exercicios2;

public class AreaQuadrilateroTeste {

    public static void main(String[] args) {
        
        int qua = AreaQuadrilatero.calcularArea(3);
        int ret = AreaQuadrilatero.calcularArea(4, 5);
        int tra = AreaQuadrilatero.calcularArea(8, 2, 3);
    
        System.out.printf("Area quadrado: %d; retangulo: %d; trapezio: %d" , qua, ret, tra);
    }

    
}
