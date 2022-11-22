package collection.set;

import java.util.Comparator;
import java.util.Objects;

public class LinPre implements Comparable<LinPre> {
	String nome;
	int anoCriacao;
	String ide;

	public LinPre(String nome, int anoCriacao, String ide) {
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.ide = ide;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	@Override
	public String toString() {
		return "\n" + nome + " - " + anoCriacao + " - " + ide;
	}

	@Override
	public int compareTo(LinPre o) {
		int nome = this.getNome().compareTo(o.nome);
		int ano = Integer.compare(getAnoCriacao(), o.anoCriacao);
		if (nome != 0)
			return nome;
		else
			return ano;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinPre other = (LinPre) obj;
		return anoCriacao == other.anoCriacao && Objects.equals(ide, other.ide) && Objects.equals(nome, other.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoCriacao, ide, nome);
	}

}

class ComparatorIde implements Comparator<LinPre> {

	@Override
	public int compare(LinPre o1, LinPre o2) {
		int ide = o1.getIde().compareTo(o2.getIde());
		if (ide != 0)
			return ide;

		int ano = Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
		return ano;
	}

}

class ComparatorAnoNome implements Comparator<LinPre>{
	
	@Override
	public int compare(LinPre o1, LinPre o2) {
				
		int ano = Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
		if(ano !=0)
			return ano;
		int nome = o1.getNome().compareTo(o2.getNome());
		int ide = o1.getIde().compareTo(o2.getIde());
		if (nome != 0)
			return nome;
		else return ide; 
	}
	
}

class ComparatorNomeAnoIde implements Comparator<LinPre>{
	
	@Override
	public int compare(LinPre o1, LinPre o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		if(nome != 0)
			return nome;
		int ano = Integer.compare(o1.getAnoCriacao(), o2.getAnoCriacao());
		if(ano != 0) 
			return ano;
		int ide = o1.getIde().compareTo(o2.getIde());
		
		return ide;
		
		
	}
}



