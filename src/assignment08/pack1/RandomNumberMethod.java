package assignment08.pack1;

import java.util.function.Supplier;

public class RandomNumberMethod {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = Math::random;
    }
}
