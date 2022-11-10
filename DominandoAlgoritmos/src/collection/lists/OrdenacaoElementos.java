package collection.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoElementos {
	
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			
			add(new Gato("Jon", 18, "Preto"));
			add(new Gato("Simba", 6, "amarelo"));
			add(new Gato("Jon", 12, "tigrado"));

		}};
		System.out.println(meusGatos);
		
		
		System.out.println("\nOrdem de insercao: ");
		System.out.println(meusGatos);

		
		System.out.println("\nOrdem de insercao: ");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		
		System.out.println("\nOrdem dos natural (nome): ");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		
		System.out.println("\nOrdem Idade:");
		//Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		
		System.out.println("\nOrdem cor:");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);

		
		System.out.println("\nOrdem Nome-Cor-Idade");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}

}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return nome + " " + idade + " " + cor;
	}
	
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
}

class ComparatorIdade implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}


class ComparatorCor implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}


class  ComparatorNomeCorIdade implements Comparator<Gato> {
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) {
			return nome;
		}
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) {
			return cor;
		}
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}