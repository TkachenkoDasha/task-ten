package task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("hsdjhsdh", "skjhddsdshds", "dsgd", "dgdgdgdg", "ol");

        System.out.println("Sort by length:");
        Collections.sort(listOfStrings, Comparator.comparingInt(String::length));
        listOfStrings.forEach(System.out::println);
        System.out.println();

        System.out.println("Sort in alphabet order by first letter:");
        Collections.sort(listOfStrings, (str1, str2) -> str1.charAt(0) - str2.charAt(0));
        listOfStrings.forEach(System.out::println);


    }
}
