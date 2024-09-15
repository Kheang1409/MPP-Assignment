package assignment11;

import java.util.ArrayList;
import java.util.List;

public class prob1 {
    public static void main(String[] args) {

    }

    private static void prob1a(){
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
//        List<Number> nums = ints; Generic Subtyping Non-Covariant
//        nums.add(3.14);
    }
    private static void prob1b(){
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints; //Covariant,
//        nums.add(3.14);
//        The Compiler doesn't know the type to be added in list of any things that extends Number
//        If you want insert item using ? super instead of extends

    }
}
