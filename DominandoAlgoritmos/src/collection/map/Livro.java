package collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Livro {

	private String nome;
	private Integer paginas;
	
	public Livro(String nome, int paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && paginas == other.paginas;
	}
	@Override
	public String toString() {
		return nome + " - "
				+ paginas;
	}
	
	

}


class ComparatorTitulo implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());		
	}

}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {
	@Override
	public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
		return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas());
	}
}



