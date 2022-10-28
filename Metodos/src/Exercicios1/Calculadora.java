package Exercicios1;

public class Calculadora {
     
        public static int[] calcular(int a, int b){

            int [] resultados = new int[4];
            resultados[0] = a + b;
            resultados[1] = a - b;
            resultados[2] = a * b;
            resultados[3] = a / b;

            return resultados;
        }
    
}
