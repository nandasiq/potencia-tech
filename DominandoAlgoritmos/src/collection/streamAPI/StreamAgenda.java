package collection.streamAPI;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;

public class StreamAgenda {

public static void main(String[] args) {
		
		Contato c1 = new Contato("Simba", 2222);
		Contato c2 = new Contato("Cami", 5555);
		Contato c3 = new Contato("Jon", 11111);
		
		Map<Integer, Contato> agenda = new TreeMap<>();
		agenda.put(4, c2);
		agenda.put(1, c1);
		agenda.put(3, c3);
		
		
		for(Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
			System.out.println(entry.getKey()
					+ " - " + entry.getValue().getNome()
					+ " tel: " + entry.getValue().getNumero());
		}
		
		System.out.println("\nOrdem numero telefone");
		
		// Ordenando via classe comparator anonima
//		Set<Map.Entry<Integer, Contato>> tel = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//			@Override
//			public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
//				return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
//			};
//		});
		
		// Criando uma estatico do comparator (metodo comparing)
//		Set<Map.Entry<Integer, Contato>> tel = new TreeSet<>(Comparator.comparing(
//				new Function<Map.Entry<Integer, Contato>, Integer>() {
//					
//					@Override
//					public Integer apply(Map.Entry<Integer, Contato> tel) {
//						return tel.getValue().getNumero();
//					}
//		}));
		
		// Criando a funcao lambda
		Set<Map.Entry<Integer, Contato>> tel = new TreeSet<>(Comparator.comparing(
				lambdaTel -> lambdaTel.getValue().getNumero()));
		tel.addAll(agenda.entrySet());
		for(Map.Entry<Integer, Contato> ittel: tel) {
			System.out.println(ittel.getKey() + " - "
					+ ittel.getValue().getNome()
					+ " tel: " + ittel.getValue().getNumero());
		}
		
		
		System.out.println("\nOrdem nome contato");
		// ordendo pelo metodo comparator manual
//		Set<Map.Entry<Integer, Contato>> nome = new TreeSet<>(new ComparatorNome());

		// Ordenando pela classe anonima do comparator
//		Set<Map.Entry<Integer, Contato>> nome = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//			@Override
//			public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
//				return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
//			}
//		});
		
		// Ordenando pelo metodo estatico Comparing
//		Set<Map.Entry<Integer, Contato>> nome = new TreeSet<>(Comparator.comparing(
//				new Function<Map.Entry<Integer, Contato>, String>() {
//					@Override
//					public String apply(Map.Entry<Integer, Contato> funnome) {
//						return funnome.getValue().getNome();
//								}
//				}
//				));
		
		// Ordenando via lambda
		Set<Map.Entry<Integer, Contato>> nome = new TreeSet<>(Comparator.comparing(
				lambdaNome -> lambdaNome.getValue().getNome()));
		
		
		nome.addAll(agenda.entrySet());
		for(Map.Entry<Integer, Contato> itNome: nome) {
				System.out.println(itNome.getKey() + " - "
						+ itNome.getValue().getNome()
						+ " tel: " + itNome.getValue().getNumero());
				
				

	}
}
}

