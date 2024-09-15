package assignment11;


import java.util.ArrayList;
import java.util.List;

public class prob2 {


    public static void main(String[] args) {

        Integer specialElement = 0;
        List<Integer> emplements = new ArrayList<>();
        emplements.add(-2);
        emplements.add(-1);
        emplements.add(0);
        emplements.add(1);
        emplements.add(2);

        Group<Integer> group = new Group<>(specialElement, emplements);
        Group group2 = Group.copy(group);

        System.out.println("Origin");
        System.out.println(group);
        System.out.println("Copy");
        System.out.println(group2);
    }

    public static class Group<T>{
        private T specialElement;
        private List<T> emplements = new ArrayList<>();
        public Group(T special, List<T> elements) {
            this.specialElement = special;
            this.emplements = elements;
        }

        @Override
        public String toString() {
            return STR."""
                    Group {
                        specialElement=\{specialElement},
                        emplements=\{emplements}
                    }
                    """;
        }

        public List<T> getEmplements(){
            return emplements;
        }
        public T getSpecialElement(){
            return specialElement;
        }

        public static Group<?> copy(Group<?> group){
            return copyHelper(group);
        }
        public static <T> Group copyHelper(Group<T> group) {
            List<T> elements = group.getEmplements();
            Group<T>  grp = new Group<T>(group.getSpecialElement(), elements);
            return grp;
        }

    }

}
