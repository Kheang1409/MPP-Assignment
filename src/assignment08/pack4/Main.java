package assignment08.pack4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("A ");
        words.add("B ");
        words.add("C ");
        words.add("D ");
        words.add("E ");
        words.add(" G");
        words.add("G*");
        words.add("G ");
        int countChar = countWords(words, 'G', '*', 2);
        System.out.println(countChar);
    }
    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.stream()
                .filter(word -> word.indexOf(c) !=-1)
                .filter(word -> word.indexOf(d) ==-1)
                .filter(word -> word.length() == len)
                .count();
    }
}
