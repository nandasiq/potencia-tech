package collection.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioTemperatura {
	
	/*
	 * Receba temperatura media dos 6 primeiros meses do ano
	 * temperaturas acima desta media, e em que mes elas ocorreram
	 * mostrar por extenso 1- janeiro 2- fevereiro, por exemplo
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		List<Double> temps = new ArrayList<>();
		
		System.out.println("Digite as temperaturas: ");
		for (int i = 0; i < 6; i++) {
			temps.add(entrada.nextDouble());
		}

//		temps.add(26.1);
//		temps.add(28.2);
//		temps.add(27.3);
//		temps.add(26.4);
//		temps.add(25.5);
//		temps.add(29.6);
		
		
		Iterator<Double> iTemp = temps.iterator();
		Double next = 0d;
		while(iTemp.hasNext()){
			next += iTemp.next();
		}
		Double media = next / temps.size();
		System.out.println("Temp. media semestre: " + media);
		System.out.println();
		
		List<Mes> meses = new ArrayList<>();
		meses.add(new Mes("Janeiro"));
		meses.add(new Mes("Fevereiro"));
		meses.add(new Mes("Marco"));
		meses.add(new Mes("Abril"));
		meses.add(new Mes("Maio"));
		meses.add(new Mes("Junho"));
		
//		for(int i = 0; i < meses.size(); i++) {
//			meses.get(i).setTemperatura(temps.get(i));
//		}
		int counter = 0;
		for(Mes imes: meses) {
			meses.get(counter).setTemperatura(temps.get(counter));
			counter++;
		}
		
		meses.forEach(System.out::println);
		System.out.println();

		System.out.println("Meses como temps acima da media: ");
		List<Integer> mesesQuentes = new ArrayList<>();
		for(Double temp: temps) {
			if(temp > media) {
				mesesQuentes.add(temps.indexOf(temp));
			}
		}
	
		for(int mesQuente: mesesQuentes) {
			System.out.println(meses.get(mesQuente));
		}
		
		
		entrada.close();
		
	}
	
	
}

class Mes {
	String nome;
	Double temperatura;

	public Mes(String nome) {
		this.nome = nome;
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
	
	public String toString() {
		return nome + " " + temperatura;
	}
}



