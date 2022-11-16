package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
	
	public static void main(String[] args) {
		
		System.out.println("Ordem aleatoria: ");
		Set<Serie> seriesTop = new HashSet<>() {{
			add(new Serie("Amiga Genial", "Drama", 45));
			add(new Serie("Friends", "Comedia", 50));
			add(new Serie("Irmao do Borel", "Desenho", 30));
			
		}};
		for(Serie serie: seriesTop) {
			System.out.println(serie.getNome() 
					+ " " + serie.getGenero()
					+ " " + serie.getDuracao());	
			}
		
		
		System.out.println("\nOrdem de insercao");
		Set<Serie> seriesTop2 = new LinkedHashSet<>() {{
			add(new Serie("TLW", "LGBTQIA+", 45));
			add(new Serie("The Office", "Comedia", 50));
			add(new Serie("Family Guy", "Desenho", 30));
			
		}};
		for(Serie serie: seriesTop2) {
			System.out.println(serie.getNome() 
					+ " " + serie.getGenero()
					+ " " + serie.getDuracao());	
			}
		
		
		System.out.println("\nOrdem natural (em duracao de epsodio)");
		Set<Serie> seriesTop3 = new TreeSet<>() {{
			add(new Serie("Sens8", "Ficcao", 50));
			add(new Serie("Grace and Frankie", "Comedia", 50));
			add(new Serie("Simpsons", "Desenho", 15));
			
		}};
		//System.out.println(seriesTop3);
		for(Serie serie: seriesTop3) {
			System.out.println(serie.getNome() 
					+ " " + serie.getGenero()
					+ " " + serie.getDuracao());	
			}

		
		System.out.println("\nOrdem Nome/Genero/Duracao ");
		Set<Serie> seriesTop4 = new TreeSet<>(new ComparatorNomeGeneroDuracao());
		seriesTop4.addAll(seriesTop);
		seriesTop4.add(new Serie("Round 6", "Horror", 40));
		seriesTop4.add(new Serie("How I met your Mother", "Comedia", 30));
		seriesTop4.add(new Serie("Fantasia", "Desenho", 60));
		seriesTop4.add(new Serie("Fantasia", "Musical", 60));
		for(Serie serie: seriesTop4) {
			System.out.println(serie.getNome() 
					+ " " + serie.getGenero()
					+ " " + serie.getDuracao());	
			}
		
		
		System.out.println("\nOrdem genero");
		Set<Serie> seriesTop5 = new TreeSet<>(new ComparatorGenero());
		seriesTop5.add(new Serie("The Crown", "Ficcao", 45));
		seriesTop5.add(new Serie("Pica-pau", "Desenho", 15));
		seriesTop5.add(new Serie("Tres Espias", "Desenho", 25));
		seriesTop5.add(new Serie("Dragon Ball-z", "Anime", 20));
		seriesTop5.add(new Serie("Chaves", "Comedia", 30));
//		for(Serie serie: seriesTop5) {
//			System.out.println(serie.getNome() 
//					+ " " + serie.getGenero()
//					+ " " + serie.getDuracao());	
//		}
		System.out.println(seriesTop5);
	}

}


