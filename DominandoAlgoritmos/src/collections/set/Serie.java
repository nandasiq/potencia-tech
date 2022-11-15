package collections.set;

import java.util.Comparator;
import java.util.Objects;

public class Serie implements Comparable<Serie> {
	private String nome;
	private String genero;
	private Integer duracao;
	
	public Serie(String nome, String genero, Integer duracao) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "Nome: " + nome
				+ "\nGenero: " + genero
				+ "\nDuracao: " + duracao;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Serie serie = (Serie) obj;
		return nome.equals(serie.nome) && genero.equals(serie.genero) 
				&& duracao.equals(serie.duracao);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, duracao);
	}
	
	@Override
	public int compareTo(Serie o) {
		int duracao = Integer.compare(this.getDuracao(), o.getDuracao());
		int genero = this.getGenero().compareTo(o.getGenero());
		if(duracao != 0) return duracao;
		
		return genero;
	}
	

}


class ComparatorNomeGeneroDuracao implements Comparator<Serie> {
	@Override
	public int compare(Serie o1, Serie o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		if(nome != 0) return nome;
		
		int genero = o1.getGenero().compareTo(o2.getGenero());
		if(genero != 0) return genero;
		
		int duracao = Integer.compare(o1.getDuracao(), o2.getDuracao());
		return duracao;
		
	}
}
class ComparatorGenero implements Comparator<Serie> {
	@Override
	public int compare(Serie o1, Serie o2) {

		
		int genero = o1.getGenero().compareTo(o2.getGenero());
		if(genero != 0) return genero;
		else return 0;
		
		
	}
}
