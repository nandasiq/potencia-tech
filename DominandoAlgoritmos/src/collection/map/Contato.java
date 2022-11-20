package collection.map;

import java.util.*;

public class Contato {
	String nome;
	Integer numero;
	
	public Contato(String nome, Integer numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "nome: " + nome +
				", numero: " + numero;
	}

}

class ComparatorTel implements Comparator<Map.Entry<Integer, Contato>> {
	
	@Override
	public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
		return o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
	}
}

class ComparatorNome implements Comparator<Map.Entry<Integer, Contato>> {
	
	@Override
	public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}
}