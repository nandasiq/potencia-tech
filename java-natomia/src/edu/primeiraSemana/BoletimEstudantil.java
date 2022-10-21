package edu.primeiraSemana;

public class BoletimEstudantil {

    public static void main(String[] args) {
        int mediaFinal = 5;

        if (mediaFinal < 6) {
            System.out.println("Reprovade");
        } else if (mediaFinal == 6) {
            System.out.println("Prova de Minerva");           
        } else {
            System.out.println("Aprovade");
        }
    }
    
}
