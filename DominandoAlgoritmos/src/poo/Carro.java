package poo;

public class Carro {
	String cor;
	String modelo;
	int tanque;
	
	Carro(){
		
	}
	
	Carro(String cor, String modelo, int tanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.tanque = tanque;
	}
	
	void setCor(String cor) {
		this.cor = cor;
	}
	String getCor() {
		return cor;
	}
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	String getModelo() {
		return modelo;
	}
	
	void setTanque(int tanque) {
		this.tanque = tanque;
	}
	int getTanque () {
		return tanque;
	}
		
	double calcularTanque(double gasolina) {
		return this.tanque * gasolina;
	}
	static double calcularTanque(int tanque, double gasolina) {
		return tanque * gasolina;
	}
	
	

}
