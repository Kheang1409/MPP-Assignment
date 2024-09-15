package assignment09.part01.startupCodeLab9Part1.prob4;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class PrimeStream {

    // Helper method to check if a number is prime
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to generate an infinite stream of prime numbers
    private Stream<Integer> generatePrimes() {
        return Stream.iterate(2, i -> i + 1)
                .filter(this::isPrime);
    }

    // Method to print the first n prime numbers
    public void printFirstNPrimes(long n) {
        generatePrimes()
                .limit(n)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(2);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}