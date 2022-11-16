package collections.set;

public class LinPre {
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
		
		return nome + " -"
				+ anoCriacao
				+ "- " + ide;
	}

}
