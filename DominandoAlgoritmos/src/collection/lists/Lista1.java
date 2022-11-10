package collection.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lista1 {

	public static void main(String[] args) {
		
	List<Double> notas = new ArrayList<>();
	
	notas.add(7.0);
	notas.add(8.5);
	notas.add(9.3);
	notas.add(5.0);
	notas.add(7.0);
	notas.add(0.0);
	notas.add(3.6);
	System.out.println(notas.toString());
	
	
	System.out.println("\nExibindo o elemento atraves do index "
	+ notas.indexOf(3.6));
	
	
	System.out.println("\nAdd na lista nota 8.0 na posicao 4: ");
	notas.add(4, 8d); //isso add o item, aumentando a lista
	System.out.println("Exibindo posicao 4: " + notas.get(4));
	System.out.println(notas.toString());
	
	
	System.out.println("\nSubstitua a nota 5.0 pela nota 6.0");
	notas.set(notas.indexOf(5.0), 6.0);
	System.out.println(notas);
	
	
	System.out.println("\nConfira se a nota 5.0 esta na lista:\n"
	+ notas.contains(5.0));
	
//	System.out.println("\nExiba todas as notas na ordem informada: ");
//	for(Double nota: notas) {
//		System.out.println(nota);
//	}
	
	System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
	
	
	System.out.println("\nExiba a menor nota: " + Collections.min(notas));
	
	System.out.println("\nExiba a maior nota: " + Collections.max(notas));
	
	Iterator<Double> iterator = notas.iterator();
	Double soma = 0d;
	while (iterator.hasNext()) {
		Double next = iterator.next();
		soma += next;
	}
	System.out.println("\nExiba a soma dos elementos " + soma);
	
	
	System.out.println("\nExiba a media dos elementos " + (soma / notas.size()));
	
	
	System.out.println("\nRemova a nota 0: ");
	notas.remove(0d);
	System.out.println("Tem 0 na lista? " + notas.contains(0d));
	
	
	
	System.out.println("\nRemova a nota da posicao 0:");
	notas.remove(0);
	System.out.println(notas);
	
	
	System.out.println("\nRemova as notas menores que 7 e exiba lista:");
	Iterator<Double> iterator1 = notas.iterator();
	while(iterator1.hasNext()) {
		Double next = iterator1.next();
		if(next < 7) {
			iterator1.remove();
		}
	}
	System.out.println(notas);
	
	
	System.out.println("\nApague toda a lista: ");
	notas.clear();
	System.out.println(notas);
	
	
	System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());
	
	}
	 
}
