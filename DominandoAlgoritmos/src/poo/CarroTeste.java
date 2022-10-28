package poo;

import java.util.Scanner;

public class CarroTeste {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Carro c = new Carro();
		System.out.println("Digite o tamanho do tanho e o valor do combustivel:");
		c.tanque = entrada.nextInt();
		double comb = entrada.nextDouble();
		
		
		System.out.println(Carro.calcularTanque(c.tanque, comb));
		System.out.println(calcularTanque(comb));
		
		entrada.close();
	}
	
	 public double calcularTanque(double gasolina) {
			return Carro.tanque * gasolina;
		}

}
