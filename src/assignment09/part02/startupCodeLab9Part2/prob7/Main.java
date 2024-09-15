package assignment09.part02.startupCodeLab9Part2.prob7;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]

		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}

	private void sort(List<Integer> intList) {
		List<Integer> result = intList.stream()
				.sorted(Comparator
						.comparing((Integer n) -> Math.abs(n))
						.thenComparing( n -> n))
				.toList();
	}

	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {

		Comparator<Integer> comparator = (a, b) -> a - b;
		list.stream()
				.sorted(Comparator
						.comparing((Integer n) -> Math.abs(n))
						.thenComparing( n -> n)).toList();
//		System.out.println(/* implement */);
		
	}
	
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		words.stream()
				.sorted(Comparator
						.comparing((String word) -> reverse(word)))
				.toList()
				.forEach(System.out::println);
//		System.out.println(/* implement */);
				
	}

	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}
