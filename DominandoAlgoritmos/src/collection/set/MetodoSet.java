package collection.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MetodoSet {
	
	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adiciones as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println(notas);
		
//		System.out.println("Exiba a posicao da nota 5.0: ");
//		nao funciona pq nao podemos usar a posicao
		
		System.out.println("\nConfira se a nota 5.0 esta no conjunto "
				+ notas.contains(notas));
		
		
		System.out.println("\nExiba a menor nota: " + Collections.min(notas));

		
		System.out.println("\nExiba a maior nota: " + Collections.max(notas));
		
		System.out.println("\nExiba a soma dos valores:");
		Iterator<Double> i = notas.iterator();
		Double soma = 0.0;
		while(i.hasNext()) {
			Double next = i.next();
			soma += next;
		}
		System.out.println(soma);
		
		
		System.out.println("\nExiba a media das notas: " + (soma/notas.size()));
		
		
		System.out.println("\nRemova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> i1 = notas.iterator();
		while(i1.hasNext()) {
			Double next = i1.next();
			if(next < 7) {
				i1.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("\nExiba todas as notas na ordem que foram informados: ");
		// apenas com linked hash set. Set list nao tem index
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);//elemento nao adicionado pq e duplicado
		notas2.add(0.0);
		notas2.add(3.6);
		System.out.println(notas2);
		
		System.out.println("\nExiba todas as notas na ordem cresente: ");
		// tem que usar treeSet, pois a treeSet organiza 
		
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("\nApague todo o conjunto: ");
		notas.clear();
		
		
		System.out.println("\nConfira se o conjunto esta vazio:\n" + notas.isEmpty());
		
		
		
		
		
	}
	

}
