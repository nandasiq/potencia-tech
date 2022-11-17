package collection.map;

import java.util.*;

public class MapaPopulacaoNE {
	/*
	 * Exiba o estado com maior populacao e sua quantidade
	 * Exiba a soma das populacoes desses estados
	 * Exiba a media da populacao desse dicionario de estados
	 * Remova os estados com a populacao menor que 4 000 000
	 * Apague o dicionario de estados
	 * Confira se o dicionario esta vazio
	 */
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
		
		
	}

}


