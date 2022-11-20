package collection.streamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

	public static void main(String[] args) {
		List<String> random = 
				Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
//		random.stream()
//			.forEach(System.out::println);

		// ordenando usando o forEach
//		random.stream().forEach(new Consumer<String>() {
//			public void accept(String s) {
//				System.out.println(s);
//			}
//		});
		
		// ordenando via lambda
//		random.stream().forEach(s -> System.out.println(s));
		
		// ordenando via method reference
		random.forEach(System.out::println);
		
		
		System.out.println("\nPegue os 5 primeiros numeros e coloque em um ser");
		random.stream()
			.limit(5)
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		System.out.println("Tranforme a lista de String para Integer");
		
		
	}
}


// operacoes intermediarias returnam uma string.
// operacoes terminais, nao da para encadear