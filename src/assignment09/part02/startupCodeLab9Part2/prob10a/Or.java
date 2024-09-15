package assignment09.part02.startupCodeLab9Part2.prob10a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		Or or = new Or();
		System.out.println(or.someSimpleIsTrue(list)); // This should print: true

		Stream<String> streamString = Stream.of("Bill", "Marry", "Kok");
		System.out.println(streamString.collect(Collectors.joining(", ")));

		/*
		You have a Stream of Integers called myIntStream and you need to output both
		the maximum and minimum values somehow, making use of this stream only once.
		Write compact code that efficiently accomplishes this.
		 */
		Stream<Integer> myIntStream = Stream.of(11, 1, 2, 3, 5, 10, 1);
		IntSummaryStatistics obj = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(obj.getMin() + " " + obj.getMax());

	}

	public boolean someSimpleIsTrue(List<Simple> list) {
//		return list.stream().map(Simple::getFlag).reduce(false, (x, y) -> x || y);
		return list.stream().map(x -> x.flag).reduce(false, (x, y) -> x || y);
//		return list.stream().anyMatch(s -> s.flag);
	}

}
