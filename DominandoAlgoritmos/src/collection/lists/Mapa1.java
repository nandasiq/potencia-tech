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
		System.out.println(carrosPopulares.keySet()); //retorna uma set
		
		
		System.out.println("\nExiba os consumos dos carros");
		System.out.println(carrosPopulares.values()); //retorna uma collection
		
		
		System.out.println("\nExiba o modelo mais economico e seu consumo");
		Double maxConsumo = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMax = "";
		
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(maxConsumo)) {
				modeloMax = entry.getKey();
				System.out.println(modeloMax);
			}
		}
		
		
		System.out.println("\nExiba o modelo menos economido e seu consumo");
		
		}
}
