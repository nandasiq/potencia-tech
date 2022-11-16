package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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
		lin.add(new LinPre("JavaScript", 1991, "VisualStudio"));

		System.out.println("Ordem de insercao");
		System.out.println(lin);
		
		
		System.out.println("Ordem natural nome");
		
		
		
//		System.out.println("Ordem natural IDE");
//		System.out.println("Ordem ano de criacao e nome");
//		System.out.println("Ordem nome, ano de criacao e IDE");
//		System.out.println("");
		
	}

}

