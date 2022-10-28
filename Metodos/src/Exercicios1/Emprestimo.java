package Exercicios1;

public class Emprestimo {

    public static double taxa3(){
        return 0.2;
    }
    public static double taxa5(){
        return 0.3;
    }
    public static double taxa7(){
        return 0.4;
    
    }public static double taxa9(){
        return 0.5;
    }
    public static double taxaMax(){
        return 0.75;
    }


    public static double valorEmprestimo(double valor, int parcela){
        double total = 0;        
        
        if (parcela == 3 || parcela == 4){
            total = valor + (valor * taxa3());
        } else if ( parcela == 5 || parcela == 5) {
            total = valor + (valor * taxa5());
        } else if ( parcela == 7 || parcela == 8) {
            total = valor + (valor * taxa7());
        } else if ( parcela == 9 || parcela == 10) {
            total = valor + (valor * taxa9());
        } else {
            total = valor + (valor * taxaMax());
        }  

        return total;
    }
    
}
