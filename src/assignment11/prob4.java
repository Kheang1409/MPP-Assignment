package assignment11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class prob4 {
    public static void main(String[] args) {
        //Prob4a
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        double dbl = sum(nums);
//        nums.add(3.14); ? extends cannot be added

        //Prob4b
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints2 = objs;
        ints2.add(3);
//        double dbl = sum(ints2);
//        didn't match the parameterized type

    }
    public static double sum(Collection<? extends Number> nums){
        double s = 0.0;
        for(Number num : nums) s += num.doubleValue();
        return s;
    }

}
