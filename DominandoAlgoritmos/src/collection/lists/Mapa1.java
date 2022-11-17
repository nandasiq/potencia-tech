package collection.lists;

import java.util.*;

public class Mapa1 {
	
	public static void main(String[] args) {
		
		System.out.println("crie um dicionaio que relacione \n"
				+ "os modelos e seus respectivos consumos");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("fox", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares.toString());
		
		System.out.println("\nSubstitua o consumo do gol por 15,2 km/l");
		carrosPopulares.put("gol", 16.1);
		System.out.println(carrosPopulares.toString());
		
		
		System.out.println("\nConfira se Tucson esta no dicionario");
		System.out.println(carrosPopulares.containsKey("tucson"));
		System.out.println(carrosPopulares.containsKey("uno"));

		
		System.out.println("\nExiba o consumo do uno");
		System.out.println(carrosPopulares.get("uno"));
		
//		System.out.println("\nExiba o terceiro modelo adicionado");
//		nao tem como pois nao e armazenado, assim como no Set
		
		System.out.println("\nExiba os modelos adicionados");
		System.out.println(carrosPopulares.keySet()); //retorna um set
		
		
		System.out.println("\nExiba os consumos dos carros");
		System.out.println(carrosPopulares.values()); //retorna uma collection
		
		
		System.out.println("\nExiba o modelo mais economico e seu consumo");
		Double maxConsumo = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMax = "";
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(maxConsumo)) {
				modeloMax = entry.getKey();
				System.out.println(modeloMax + " - " + maxConsumo);
			}
		}
		
		
		System.out.println("\nExiba o modelo menos economido e seu consumo");
		Double minConsumo = Collections.min(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entradas = carrosPopulares.entrySet();
		String modeloMin = "";
		for(Map.Entry<String, Double> entrada: entradas) {
			if(entrada.getValue().equals(minConsumo)) {
				modeloMin = entrada.getKey();
				System.out.println(modeloMin + " - " + minConsumo);
			}
		}
		
		
		System.out.println("\nExiba a soma dos consumos");
		Iterator<Double> it = carrosPopulares.values().iterator();
		Double soma = 0.0;
		while(it.hasNext()) {
			soma += it.next();
		}
		System.out.println(soma);
		
		
		System.out.println("\nExiba a media da soma dos consumos");
		System.out.println(soma/ carrosPopulares.size());
		
		
		System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l");
		Iterator<Double> it1 = carrosPopulares.values().iterator();
		while(it1.hasNext()) {
			if(it1.next() == 15.6) {
				it1.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		
		System.out.println("\nExiba todos os carros na ordem que foram informados");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>();
		carrosPopulares1.put("gol", 14.4);
		carrosPopulares1.put("uno", 15.6);
		carrosPopulares1.put("mobi", 16.1);
		carrosPopulares1.put("hb20", 14.5);
		carrosPopulares1.put("fox", 14.5);
		carrosPopulares1.put("kwid", 15.6);
		System.out.println(carrosPopulares1);
		
		
		System.out.println("\nExiba o dicionario ordenado pelo modelo");
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		//o treemap ordena por ordem da chave, no caso aqui a chave e o modelo
		System.out.println(carrosPopulares2);
		
		
		System.out.println("\nApague o dicionario de carros");
		carrosPopulares.clear();
		
		
		System.out.println("\nVerifique se o dicionario de carros esta vazio");
		System.out.println(carrosPopulares.isEmpty());
		
		}
}























