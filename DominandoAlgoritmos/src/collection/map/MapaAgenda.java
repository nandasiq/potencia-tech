package collection.map;

import java.util.*;

public class MapaAgenda {

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
		Set<Map.Entry<Integer, Contato>> tel = new TreeSet<>(new ComparatorTel());
		tel.addAll(agenda.entrySet());
		for(Map.Entry<Integer, Contato> ittel: tel) {
			System.out.println(ittel.getKey() + " - "
					+ ittel.getValue().getNome()
					+ " tel: " + ittel.getValue().getNumero());
		}
		
		System.out.println("\nOrdem nome contato");
		Set<Map.Entry<Integer, Contato>> nome = new TreeSet<>(new ComparatorNome());
		nome.addAll(agenda.entrySet());
		for(Map.Entry<Integer, Contato> itNome: nome) {
			System.out.println(itNome.getKey() + " - "
					+ itNome.getValue().getNome()
					+ " tel: " + itNome.getValue().getNumero());
		}
		
		
		
	}
}
/*
 * Dadas as seguintes informações de id e contato, crie um dicionário 
 * e ordene este dicionário exibindo (Nome id - Nome contato); 
 * id = 1 - Contato = nome: Simba, numero: 2222; 
 * id = 4 - Contato = nome: Cami, numero: 5555; 
 * id = 3 - Contato = nome: Jon, numero: 1111;
 */

