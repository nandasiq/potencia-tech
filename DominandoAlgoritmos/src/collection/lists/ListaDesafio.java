package collection.lists;

import java.util.LinkedList;
import java.util.List;

public class ListaDesafio {

	public static void main(String[] args) {

//Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
       
        System.out.println("Crie uma lista chamada notas2 " +
        		"e coloque todos \nos elementos da list Arraylist nessa nova lista: ");
        List<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
    	notas2.add(8.5);
    	notas2.add(9.3);
    	notas2.add(5.0);
    	notas2.add(7.0);
    	notas2.add(0.0);
    	notas2.add(3.6);
        

    	System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: ");
    	System.out.println(notas2.get(0));

    	
    	System.out.println("\nMostre a primeira nota da nova lista removendo-o: ");
    	System.out.println(notas2.get(0));
    	notas2.remove(0);
    	System.out.println(notas2);
	}
	
}
