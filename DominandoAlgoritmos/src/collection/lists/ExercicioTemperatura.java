package collection.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioTemperatura {
	
	/*
	 * Receba temperatura media dos 6 primeiros meses do ano
	 * e amarzene-os em uma lista. Calcule a media semestral das
	 * temperaturas acima desta media, e em que mes elas ocorreram
	 * mostrar por extenso 1- janeiro 2- fevereiro, por exemplo
	 */
	
	public static void main(String[] args) {
		
		List<Mes> meses = new ArrayList<>() {{
			add(new Mes(1,"janeiro", 28.7));
			add(new Mes(2, "fevereiro", 24.6));
			add(new Mes(3, "marco", 23.1));
			add(new Mes(4, "abril", 22.4));
			add(new Mes(5, "maio", 21.2));
			add(new Mes(6, "junho", 20.3));
		}};
		
		Iterator<Double> iterator = meses.iterator(temperatura);
		
		
		
	}

}

class Mes {
	private int mes;
	private String nome;
	private Double temperatura;
	
	public Mes(int mes, String nome, Double temperatura) {
		this.mes = mes;
		this.nome = nome;
		this.temperatura = temperatura;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
	
	
}
