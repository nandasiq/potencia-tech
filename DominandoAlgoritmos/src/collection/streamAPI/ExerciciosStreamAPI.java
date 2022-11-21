package collection.streamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		
		
		System.out.println("\nPegue os 5 primeiros numeros e coloque em um Set");
		Set<String> collecSet = random.stream().limit(5).collect(Collectors.toSet());
		System.out.println(collecSet);
		// posso ordenar tanto da forma de cima, criando um set,
		// ou da forma abaixo, apenas imprimindo os elementos
//		random.stream()
//			.limit(5)
//			.collect(Collectors.toSet())
//			.forEach(System.out::println);
		
		System.out.println("\nTranforme a lista de String para Integer");

		//jeito mais puro de fazer
//		random.stream()
//			.map(new Function<String, Integer>() {
//				@Override
//				public Integer apply(String s) {
//					return Integer.parseInt(s);
//				}
//		});
		
		// fazendo com lambda
//		random.stream()
//			.map(s -> Integer.parseInt(s));
		
		// fazendo com method reference
//		random.stream()
//			.map(Integer::parseInt)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);

		// armazenando em uma variavel
		List<Integer> collectList = random.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println(collectList);
		
		
		System.out.println("\nPegue os numeros pares e maiores que 2 e coloque em uma lista");
		
		//forma mauis manual que tem
//		List<Integer> listPares = random.stream()
//			.map(Integer::parseInt)
//			.filter(new Predicate<Integer>() {
//				@Override
//				public boolean test(Integer i) {
//					if(i % 2 == 0 && i > 2) {
//						return true;
//					}
//					return false;
//				}
//			}).collect(Collectors.toList());
		
		//utilizando expressao lambda
		List<Integer> listPares = random.stream()
				.map(Integer::parseInt)
				.filter(i -> (i %2 == 0 && i > 2))
				.collect(Collectors.toList());
		System.out.println(listPares);
		
		System.out.println("\nExiba a media dos numeros");
		
//		random.stream()
//			.mapToInt(new ToIntFunction<String>() {
//				@Override
//				public int applyAsInt(String s) {
//					return Integer.parseInt(s);
//				}
//			});
		
		//simplificando
//		random.stream()
//			.mapToInt(Integer::parseInt) // isso e simplicicacao do codigo comentado acima
//			.average()
//			.ifPresent(	new DoubleConsumer() {
//				@Override
//				public void accept(double v) {
//					System.out.println(v);
//				}
//		});
		
		//simplificando
//		random.stream()
//			.mapToInt(Integer::parseInt)
//			.average()
//			.ifPresent(v -> System.out.println(v));
		
		
		random.stream()
			.mapToInt(Integer::parseInt)
			.average()
			.ifPresent(System.out::println);
		
		System.out.println("\nRemova os valores impares");
		// tem que utilizar como list, pois strem nao 
//		collectList.removeIf(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer i) {
//				if(i % 2 != 0) {
//					return true;
//				}
//			return false;
//			}
//		});
		
		// simplificando
		collectList.removeIf(i -> (i % 2 != 0));
		System.out.println(collectList);
		
		System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante");
		random.stream().skip(3)
		.forEach(System.out::println);
		
		System.out.println("\nRetirando os numeros repetidos da lista, quantos numeros ficam?");
		Set<String> randomSet = random.stream().collect(Collectors.toSet());
		System.out.println(randomSet.size());
		
		
		System.out.println("\nMostre o menor valor");
		random.stream()
			.mapToInt(Integer::parseInt)
			.min()
			.ifPresent(System.out::println);
		
	
		System.out.println("\nMostre o maior valor");
		random.stream()
			.mapToInt(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);

		
		System.out.println("\nMostre a lista na ordem numerica");
		List<Integer> listaInt = random.stream()
				.map(Integer::parseInt)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(listaInt);
		
		
		System.out.println("\nSoma os numeros impares");
		int soma = 0;
//		List<Integer> listaImpares = random.stream()
//				.map(Integer::parseInt)
//				.filter(i -> i % 2 != 0)
//				.collect(Collectors.toList());
//		for(Integer impar: listaImpares) {
//			soma += impar;
//		}
		
		// simplificando
		soma = listaInt.stream()
				.filter(i -> i % 2 != 0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(soma);
				
		
		System.out.println("\nAgrupe os valores impares multiplos de 3 e de 5");
		Map<Boolean, List<Integer>> multiplos = listaInt.stream()
				.collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
		System.out.println(multiplos);
		//dica collect(Collectors.groupingBy(new Function())
		
		
		
		
	}
}


// operacoes intermediarias retornam uma string.
// operacoes terminais, nao da para encadear