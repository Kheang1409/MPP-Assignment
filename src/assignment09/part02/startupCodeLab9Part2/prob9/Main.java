package assignment09.part02.startupCodeLab9Part2.prob9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //printSquares(4);
        List<Integer> ints = new ArrayList<>();
        ints.add(4);
        ints.add(9);
        ints.add(16);
        ints.add(25);
        System.out.println(getSquares(ints));
    }

    public static void printSquares(int num) {
        /*
           1^1 => print
           2^2 =>
           3^2 =>
           4^2 =>
         */
        IntStream.iterate(1, n -> (int) Math.pow(Math.sqrt(n)+1,2))
                .limit(num)
                .forEach(n -> System.out.println(n));

        IntStream.iterate(1, n -> n+1)
                .limit(num)
                .forEach(n -> System.out.println(n*n));
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        return numbers.stream().map(x -> (int) Math.sqrt(x)).toList();
    }


    private static void test(int num){
//        IntStream.iterate(1, n -> n + 1)
//                .map( n -> n*n)
//                .limit(num)
//                .forEach(n -> System.out.println(n));

        IntStream.rangeClosed(1, num).map(n -> n * n).forEach(System.out::println);
    }













}
