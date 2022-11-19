package collection.map;

import java.util.*;

public class ComparatorMapObjetoSet {

	/*
	 * Crie uma classe Aluno que possua os atributos: nome, matricula. 
	 * Crie uma classe Curso que possua os atributos: disciplina, duracao. 
	 * Em seguida, instancie 3 objetos alunos e para cada aluno uma lista
	 * contendo 2 cursos fazendo a relação entre eles dentro de um dicionário.
	 * Feito isso, exiba o dicionário com o seguintes requisito:
	 *  Key: Nome do aluno e matrícula -
	 *  Value: Nome das disciplinas na qual estão matriculados
	 */
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno ("Joao", 1245);
		Aluno aluno2 = new Aluno ("Maria", 1246);
		Aluno aluno3 = new Aluno ("Jose", 1247);
		
		Disci disci1 = new Disci("Java", 5);
		Disci disci2 = new Disci("Pyton", 4);
		Disci disci3 = new Disci("C++", 6);
		
		Set<Disci> lista1 = new HashSet<>(Arrays.asList(disci1, disci2));
		Set<Disci> lista2 = new HashSet<>(Arrays.asList(disci2, disci3));
		Set<Disci> lista3 = new HashSet<>(Arrays.asList(disci1, disci3));
		
		Map<Aluno, Set<Disci>> dici = new HashMap<>();
		dici.put(aluno1, lista1);
		dici.put(aluno2, lista2);
		dici.put(aluno3, lista3);
		
		for(Map.Entry<Aluno, Set<Disci>> entrada: dici.entrySet()) {
			System.out.println(entrada.getKey());
			for(Disci entrada1: entrada.getValue()) {
				System.out.println(entrada1.getNome());
			}
			System.out.println();
		}

		
	}

}



