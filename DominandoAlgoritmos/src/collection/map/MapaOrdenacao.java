package collection.map;

import java.util.*;

public class MapaOrdenacao {
	public static void main(String[] args) {
		
		System.out.println("Exiba ordem aleatoria");
		Map<String, Livro> aleatoria = new HashMap<>() {{
			put("Hawing, Stephen", new Livro("Uma breve historia sobre o tempo", 256));
			put("Duhigg, Charles", new Livro("O poder do habito", 408));
			put("Harari, Yuval Noah", new Livro("Homodeus", 206));
		}}; 
		for(Map.Entry<String, Livro> livro: aleatoria.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		
		System.out.println("\nExiba ordem insercao");
		Map<String, Livro> insercao = new LinkedHashMap<>() {{
			put("Hawing, Stephen", new Livro("Uma breve historia sobre o tempo", 256));
			put("Duhigg, Charles", new Livro("O poder do habito", 408));
			put("Harari, Yuval Noah", new Livro("Homodeus", 206));
		}}; 
		for(Map.Entry<String, Livro> livro: insercao.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		
		System.out.println("\nExiba ordem alfabetica autores");
		Map<String, Livro> autores = new TreeMap<>(aleatoria);
		for(Map.Entry<String, Livro> livro: autores.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		
		System.out.println("\nExiba ordem alfabetica nomes dos livros");
		// tem que usar set, pois vamos analisar o set de Livro e manipular algo la dentro
		Set<Map.Entry<String, Livro>> titulo = new TreeSet<>(new ComparatorNome());
		titulo.addAll(autores.entrySet());
		for(Map.Entry<String, Livro> livro: titulo) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		
		System.out.println("\nExiba ordem numero de paginas");
		Set<Map.Entry<String, Livro>> pagina = new TreeSet(new ComparatorPagina());
		pagina.addAll(titulo);
		for(Map.Entry<String, Livro> livro: pagina) {
			System.out.println(livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
		}
		
		
	}

}
