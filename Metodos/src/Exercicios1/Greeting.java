package Exercicios1;

public class Greeting {

    public static void salutar(int hora) {
        if(hora > 3 && hora < 12){
            System.out.println("Bom dia");
        } else if (hora > 12 && hora < 19) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Bom noite");
        }

    }
    
}
