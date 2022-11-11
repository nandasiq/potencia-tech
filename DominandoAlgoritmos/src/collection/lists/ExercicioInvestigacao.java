package collection.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioInvestigacao {

	/*
	Utilizando listas, faça um programa que faça 5 perguntas
	 para uma pessoa sobre um crime. As perguntas são:
	1. "Telefonou para a vítima?"
	2. "Esteve no local do crime?"
	3. "Mora perto da vítima?"
	4. "Devia para a vítima?"
	5. "Já trabalhou com a vítima?"
	Se a pessoa responder positivamente a 2 questões ela deve ser 
	classificada como "Suspeita", entre 3 e 4 como
	"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
	*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<String> p = new ArrayList<>();
		p.add("Telefonou para a vitima?");
		p.add("Esteve no local do crime?");
		p.add("Mora perto da vitima?");
		p.add("Devia para a vitima?");
		p.add("Ja trabalhou com a vitima?");

		System.out.println("Para cada pergunta responda 1 para sim, ou 2 para nao");
		int sim = 0;
		int nao = 0;
		
		List<Integer> r = new ArrayList<>();
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
			r.add(entrada.nextInt());
			if(r.get(i) == 1) {
				sim++;
			} else if(r.get(i) == 2) {
				nao++;
			} else {
				System.out.println("Resposta invalida. Tente novamente");
				r.remove(i);
				r.add(i, entrada.nextInt());
			}
		}
		
		if(sim == 2) {
			System.out.println("Suspeito");
		} else if(sim > 2 && sim < 5) {
			System.out.println("Cumplice");
		} else if(sim > 4) {
			System.out.println("Assasino");
		} else {
			System.out.println("Inocente");
		}
		
		
		entrada.close();
		
	}
}
