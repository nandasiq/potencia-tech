package collection.map;

import java.util.*;


public class Disci {
	String nome;
	Integer duracao;
	public Disci(String nome, Integer duracao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getDuracao() {
		return duracao;
	}
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	@Override
		public String toString() {
			return nome;
		}
	@Override
	public int hashCode() {
		return Objects.hash(duracao, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disci other = (Disci) obj;
		return Objects.equals(duracao, other.duracao) && Objects.equals(nome, other.nome);
	}

}

class ComparatorDisci implements Comparator<Map.Entry<Aluno, Disci>> {

	@Override
	public int compare(Map.Entry<Aluno, Disci> o1, Map.Entry<Aluno, Disci> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}
	
}

class ComparatorDuracao implements Comparator<Map.Entry<Aluno, Disci>> {
	
	@Override
	public int compare(Map.Entry<Aluno, Disci> o1, Map.Entry<Aluno, Disci> o2) {
		return o1.getValue().getDuracao().compareTo(o2.getValue().getDuracao());
	}
}
