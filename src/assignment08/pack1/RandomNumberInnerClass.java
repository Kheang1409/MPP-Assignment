package assignment08.pack1;

import java.util.function.Supplier;

public class RandomNumberInnerClass {

    public static void main(String[] args) {
        Supplier<Double> randomSupplier = new RandomNumberSupplier();
        double randomValue = randomSupplier.get();
        System.out.println("Random number: " + randomValue);
    }
    private static class  RandomNumberSupplier implements Supplier<Double> {
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
