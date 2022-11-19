package collection.map;

import java.util.*;

public class Aluno {
	String nome;
	Integer matricula;
	
	public Aluno(String nome, Integer matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	@Override
		public String toString() {
			return nome + " " + matricula;
		}
	@Override
	public int hashCode() {
		return Objects.hash(matricula, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula) && Objects.equals(nome, other.nome);
	}
	
	
}


class ComparatorAluno implements Comparator<Map.Entry<Aluno, Disci>> {
	@Override
	public int compare(Map.Entry<Aluno, Disci> o1, Map.Entry<Aluno, Disci> o2) {
		return o1.getKey().getNome().compareToIgnoreCase(o2.getKey().getNome());
	}
}

class ComparatorMatricula implements Comparator<Map.Entry<Aluno, Disci>> {
	
	@Override
	public int compare(Map.Entry<Aluno, Disci> o1, Map.Entry<Aluno, Disci> o2) {
		return o1.getKey().getMatricula().compareTo(o2.getKey().getMatricula());
	}
}




















