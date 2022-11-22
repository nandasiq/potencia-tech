package collection.set;

import java.util.*;

public class ExercicioArcoIris{

	/*
	 * Crie uma conjunto contendo as cores do arco-íris e: 
	 * a) Exiba todas as cores o arco-íris uma abaixo da outra;  *
	 * b) A quantidade de cores que o arco-íris tem; *
	 * c) Exiba as cores em ordem alfabética; *
	 * d) Exiba as cores na ordem inversa da que foi informada; 
	 * e) Exiba todas as cores que começam com a letra ”v”; 
	 * f) Remova todas as cores que não começam com a letra “v”; 
	 * g) Limpe o conjunto;
	 * h) Confira se o conjunto está vazio;
	 */

	public static void main(String[] args) {

		Set<String> arcoIris = new HashSet<>(); 
		arcoIris.add("vermelho");
		arcoIris.add("laranja");
		arcoIris.add("amarelo");
		arcoIris.add("verde");
		arcoIris.add("azul");
		arcoIris.add("anil");
		arcoIris.add("violeta");
		
		System.out.println("Cores uma abaixo da outra:");
		for(String i: arcoIris) {
			System.out.println(i);
		}
		

		System.out.println();
		System.out.println("Quantidade de cores:");
		System.out.println(arcoIris.size());
		
		
		System.out.println();
		System.out.println("Exibir em ordem alfabetica");
		Set<String> arcoIris1 = new TreeSet<>(); 
		arcoIris1.addAll(arcoIris);
		System.out.println(arcoIris1);
		
		
		System.out.println();
		System.out.println("Exibir em ordem inversa de insercao");
		List<String> arcoIris2 = new ArrayList<>();
		arcoIris2.addAll(arcoIris);
		Collections.reverse(arcoIris2);
		System.out.println(arcoIris2);
		
		
		System.out.println();
		System.out.println("Exibir todas as cores que comecam com a letra 'v' ");
		Set<String> coresV = new TreeSet<>();
		for(String cor: arcoIris) {
			if(cor.startsWith("v")) {
				coresV.add(cor);
			}
		}
		System.out.println(coresV.toString());
		
		
		System.out.println();
		System.out.println("Exibir todas as cores que nao comecam com a letra 'v' ");
		Iterator<String> it = arcoIris.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("v")) {
				it.remove();
			}
		}
		System.out.println(arcoIris);
		
		
		System.out.println();
		System.out.println("Limpe o conjunto");
		arcoIris.clear();
		
		
		System.out.println();
		System.out.println("Confira se o conjunto esta vazio");
		System.out.println(arcoIris.isEmpty());
		


	}

}







