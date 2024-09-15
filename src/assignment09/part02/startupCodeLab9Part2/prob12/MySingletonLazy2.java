package assignment09.part02.startupCodeLab9Part2.prob12;

import java.util.Optional;

public class MySingletonLazy2 {
    private static MySingletonLazy2 instance = null;
    private MySingletonLazy2(){

    }
    private static MySingletonLazy2 createInstance(){
        System.out.println("created");
         instance = new MySingletonLazy2();
         return instance;
    }

    public static MySingletonLazy2 getInstance(){
        Optional<MySingletonLazy2> option = Optional.ofNullable(instance);
        return option.orElseGet(() -> new MySingletonLazy2());
    }

    public static void main(String[] args) {
        MySingletonLazy2 obj = MySingletonLazy2.getInstance();
        MySingletonLazy2 obj2 = MySingletonLazy2.getInstance();
        MySingletonLazy2 obj3 = MySingletonLazy2.getInstance();
    }
}
