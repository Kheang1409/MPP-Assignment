package assignment08.pack1;

import java.util.function.Supplier;

public class RandomNumberLambdaExpression {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
        double randomValue = randomSupplier.get();
        System.out.println("Random number: " + randomValue);
    }
}