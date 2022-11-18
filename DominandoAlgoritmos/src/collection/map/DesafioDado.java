package collection.map;

import java.util.*;

/*
 * Faca um programa que simule um lancamento de dados
 * Lance o dado 100 vezes e armazene
 * Mostre quantas vezes cada valor foi inserido
 */
public class DesafioDado {
	public static void main(String[] args) {
		List<Integer> valores = new ArrayList<>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
		}};
		
		Map<Integer, Integer> dados = new HashMap<>();
		for (int i = 0; i < 100; i++) {
			Random rand = new Random();
			dados.put(i, valores.get(rand.nextInt(valores.size())));
		}
		
		Set<Map.Entry<Integer, Integer>> resultados = dados.entrySet();
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		for(Map.Entry<Integer, Integer> itResultado: resultados) {
			if(itResultado.getValue() == 1) {
				um++;
			} else if(itResultado.getValue() == 2) {
				dois++;
			} else if(itResultado.getValue() == 3) {
				tres++;
			} else if(itResultado.getValue() == 4) {
				quatro++;
			} else if(itResultado.getValue() == 5) {
				cinco++;
			} else if(itResultado.getValue() == 6) {
				seis++;
			}
			
		}
		System.out.printf("O numero um saiu %d vezes \n"
				+ "O numero dois saiu %d vezes \n"
				+ "O numero tres saiu %d vezes\n"
				+ "O numero quatro saiu %d vezes \n"
				+ "O numero cinco saiu %d vezes \n"
				+ "O numero seis saiu %d vezes \n",
				um, dois, tres, quatro, cinco, seis);
	}

}


