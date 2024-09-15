package assignment11;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob5 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(70);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Integer second = secondSmallest(list);
        System.out.println(second);
        System.out.println(getSecondSmallest(list));

        List<String> studentNames = new ArrayList<>();
        studentNames.add("Hang Kheang");
        studentNames.add("Bishnu");
        studentNames.add("Pengleng");
        studentNames.add("Sarun");

        String secondName = secondSmallest(studentNames);
        System.out.println(secondName);
        System.out.println(getSecondSmallest(studentNames));

        List<LocalDate> listDL = new ArrayList<>();
        listDL.add(LocalDate.of(1990, 1, 1));
        listDL.add(LocalDate.of(1990, 2, 1));
        listDL.add(LocalDate.of(1990, 3, 1));
        listDL.add(LocalDate.of(1990, 4, 1));

        Stream<String> emptyStream = Stream.empty();
        Optional<String> result = emptyStream.findFirst();
        System.out.println(result.orElse("No elements"));



        System.out.println(getSecondSmallest(listDL));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }


    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() <=1) return null;

        T min = list.get(0);
        T secondMin = list.get(1);

        if(min.compareTo(secondMin) > 0){
            min = list.get(1);
            secondMin = list.get(0);
        }

        for(int i = 2; i < list.size(); i++){
            T temp = list.get(i);
            if(min.compareTo(temp) > 0){
                secondMin = min;
                min = temp;
            }
            else if(secondMin.compareTo(temp) > 0 && min.compareTo(temp) < 0){
                secondMin = temp;
            }
        }
        return secondMin;
    }

    public static <T extends Comparable<? super T>> T getSecondSmallest(List<T> array) {
        if (array == null || array.size() < 2) {
            return null;
        }
        List<T> sortedList = array.stream()
                .sorted()
                .collect(Collectors.toList());
        return sortedList.get(1);
    }
}
