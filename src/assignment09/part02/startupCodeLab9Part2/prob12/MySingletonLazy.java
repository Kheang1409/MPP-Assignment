package assignment09.part02.startupCodeLab9Part2.prob12;

import java.util.Optional;

public class MySingletonLazy {

    private static Optional<MySingletonLazy> instance = Optional.empty();

    private MySingletonLazy() {}

    public static MySingletonLazy getInstance() {
        if (!instance.isPresent()) {
            instance = Optional.of(new MySingletonLazy());
        }
        return instance.get();
    }

    public static void main(String[] args) {
        MySingletonLazy singleton1 = MySingletonLazy.getInstance();
        MySingletonLazy singleton2 = MySingletonLazy.getInstance();

        System.out.println("Singleton 1: " + singleton1);
        System.out.println("Singleton 2: " + singleton2);
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));
    }
}
