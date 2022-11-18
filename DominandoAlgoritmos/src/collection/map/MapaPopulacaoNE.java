package collection.map;

import java.util.*;

public class MapaPopulacaoNE {
	public static void main(String[] args) {
		System.out.println("Crie um dicionario e relacione estados populacoes");
		Map<String, Integer> ne = new HashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		System.out.println(ne);
		
		System.out.println("\nSubstitua a populacao do estado do RN por 3534165");
		ne.put("RN", 3534165);
		System.out.println(ne);
		
		System.out.println("\nConfira se o estado PB esta no \n"
				+ "dicionario, caso nao adicione");
		if(!ne.containsKey("PB")){
				ne.put("PB", 4039277);
		}
		System.out.println(ne);
		
		System.out.println("\nExiba a populacao de PE");
		System.out.println(ne.get("PE"));
		
		System.out.println("\nExiba os estados e populacoes na ordem que foi informado");
		Map<String, Integer> neLinked = new LinkedHashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		System.out.println(neLinked);

		System.out.println("\nExiba os estados e suas populacoes em ordem alfabetica");
		Map<String, Integer> alfa = new TreeMap(neLinked);
		System.out.println(alfa);
		
		
		System.out.println("\nExiba o estado com menor populacao e sua quantidade");
		Integer minPop = Collections.min(ne.values());
		Set<Map.Entry<String, Integer>> itMinPop = ne.entrySet();
		String minEs = "";
		for(Map.Entry<String, Integer> entrada: itMinPop)
			if(entrada.getValue() == minPop) {
				minEs = entrada.getKey();
				System.out.println(minEs + " " + minPop);
			}
		
		
		System.out.println("\nExiba o estado com maior populacao e sua quantidade");
		Integer maxPop = Collections.max(ne.values());
		Set<Map.Entry<String, Integer>> itMaxPop = ne.entrySet();
		String maxEs = "";
		for(Map.Entry<String, Integer> entrada: itMaxPop) {
			if(entrada.getValue() == maxPop) {
				maxEs = entrada.getKey();
				System.out.println(maxEs + " " + maxPop);
			}
		}
		
		
		System.out.println("\nExiba a soma das populacoes desses estados");
		Integer soma = 0;
		Iterator<Integer> itSoma = ne.values().iterator();
		while(itSoma.hasNext()) {
			soma += itSoma.next();
		}
		System.out.println(soma);
		
		
		System.out.println("\nExiba a media da populacao desse dicionario de estados");
		System.out.println(soma/ne.size());
		
		
		System.out.println("\nRemova os estados com a populacao menor que 4.000.000");
		Iterator<Integer> it4mi = ne.values().iterator();
		while(it4mi.hasNext()) {
			if(it4mi.next() < 4000000) {
				it4mi.remove();
			}
		}
		System.out.println(ne);
		
		System.out.println("\nApague o dicionario de estados");
		ne.clear();
		
		
		System.out.println("\nConfira se o dicionario esta vazio");
		System.out.println(ne.isEmpty());
		
	}

}

