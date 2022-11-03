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
		
		Carro c2 = new Carro("verde", "fox", 42);
		
		Carro c3 = new Carro();
		c3.setCor("vermelho");
		c3.setModelo("pajero");
		c3.setTanque(60);
		
		System.out.println("Tanque cheio carro 2: " + c2.calcularTanque(4.2));
		System.out.println("Tanque cheio carro 3: " + c3.calcularTanque(5.2));
		
		entrada.close();
	}
	
	
}
