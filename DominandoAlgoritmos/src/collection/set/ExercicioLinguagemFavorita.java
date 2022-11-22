package collection.set;

import java.util.*;

public class ExercicioLinguagemFavorita {

	public static void main(String[] args) {
	/*
	 * Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
	* Em seguida, crie um conjunto com 3 linguagens e 
	* faça um programa que ordene esse conjunto por:
	* a) Ordem de inserção;
	* b) Ordem natural(nome);
	* c) IDE;
	* d) Ano de criação e nome;
	* e) Nome, ano de criação e IDE;
	* Ao final, exiba as linguagens no console, um abaixo da outra.
	*/

		
		Set<LinPre> lin = new LinkedHashSet<>();
		lin.add(new LinPre("Java", 1995, "Eclipse"));
		lin.add(new LinPre("Python", 1991, "PyChram"));
		lin.add(new LinPre("JavaScript", 1998, "VisualStudio"));

		System.out.println("Ordem de insercao");
		System.out.println(lin);
		
		
		System.out.println();
		System.out.println("Ordem natural nome");
		Set<LinPre> nome = new TreeSet<>();
		nome.add(new LinPre("java", 95, "eclipse"));
		nome.add(new LinPre("python", 91, "pyChram"));
		nome.add(new LinPre("javaScript", 92, "visualStudio"));
		nome.add(new LinPre("kotlin", 90, "texteditor"));
		System.out.println(nome);
		
		
		System.out.println();
		System.out.println("Ordem IDE");
		Set<LinPre> ide = new TreeSet<>(new ComparatorIde());
		ide.addAll(lin);
		System.out.println(ide);
		
		
		System.out.println();
		System.out.println("Ordem ano de criacao e nome");
		Set<LinPre> anoNome = new TreeSet(new ComparatorAnoNome());
		anoNome.addAll(nome);
		anoNome.add(new LinPre("kotlin", 92, "sublime"));
		System.out.println(anoNome);
		
		
		System.out.println();
		System.out.println("Ordem nome, ano de criacao e IDE");
		Set<LinPre> nomeAnoIde = new TreeSet<>(new ComparatorNomeAnoIde());
		nomeAnoIde.addAll(anoNome);
		System.out.println(nomeAnoIde);
				
	}

}

