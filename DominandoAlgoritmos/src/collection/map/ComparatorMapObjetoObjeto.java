package collection.map;

import java.util.*;

public class ComparatorMapObjetoObjeto {
	/*Crie uma classe Aluno que possua os atributos: nome, matricula.
	Crie uma classe Curso que possua os atributos: nome, disciplina.
	Em seguida, instancie 3 objetos alunos e 3 cursos, fazendo a relação entre eles
	 dentro de um dicionário.
	Feito isso, ordene esse dicionário por:
	A) Nome da disciplina
	a) Duração do curso;
	b) Nome do aluno;
	d) Matricula do aluno;
	*/

	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Nadia", 1245);
		Aluno aluno2 = new Aluno("Ana", 1246);
		Aluno aluno3 = new Aluno("Cleo", 1247);
		
		Disci disci1 = new Disci("Biologia", 8);
		Disci disci2 = new Disci("Geografia", 3);
		Disci disci3 = new Disci("Matematica", 6);
		
		Map<Aluno, Disci> relacao = new HashMap<>() {{
			put(aluno1, disci1);
			put(aluno2, disci2);
			put(aluno3, disci3);
		}};
		
		System.out.println("Ordenamo nome Disciplina");
		Set<Map.Entry<Aluno, Disci>> entries = new TreeSet<>(new ComparatorDisci());
		entries.addAll(relacao.entrySet());
		System.out.println(entries);
		
		System.out.println("\nOrdenanacao Duracao do Curso");
		Set<Map.Entry<Aluno, Disci>> entries1 = new TreeSet<>(new ComparatorDuracao());
		entries1.addAll(relacao.entrySet());
		System.out.println(entries1);
		
		System.out.println("\nOrdenanacao nome do Aluno");
		Set<Map.Entry<Aluno, Disci>> entries2 = new TreeSet(new ComparatorAluno());
		entries2.addAll(relacao.entrySet());
		System.out.println(entries2);
		
		System.out.println("\nOrdenanacao nome do Matricula Aluno");
		Set<Map.Entry<Aluno, Disci>> entries3 = new TreeSet(new ComparatorMatricula());
		entries3.addAll(relacao.entrySet());
		System.out.println(entries3);
		
		
		

		
		
	}
}
