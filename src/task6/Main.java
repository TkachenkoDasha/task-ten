package task6;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> nonNull = Objects::nonNull;
        Predicate<String> nonNullAndNonEmpty = nonNull.and(s -> !s.equals(""));

        System.out.println(nonNullAndNonEmpty.test(""));
    }
}
